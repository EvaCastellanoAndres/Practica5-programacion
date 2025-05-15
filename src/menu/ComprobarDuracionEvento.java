package menu;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Evento;

public class ComprobarDuracionEvento {
	/**
	 * El método muestra primero una lista numerada de todos los eventos
	 * disponibles, y luego se pide que se seleccione un evento por número. Tras
	 * validar el número introducido, el método calcula y muestra por consola
	 * cuántos días dura el evento seleccionado. También espera a que se pulse enter
	 * para finalizar.
	 * 
	 * @param input        Scanner que permite escribir por consola
	 * @param listaEventos ArrayList de eventos disponibles entre los que se puede
	 *                     elegir
	 */
	public static void comprobarDuracion(Scanner input, ArrayList<Evento> listaEventos) {
		String[] nombreEvento = new String[listaEventos.size()];
		System.out.println("-- Seleccione el evento que desea comprobar --");

		for (int i = 0; i < listaEventos.size(); i++) {
			nombreEvento[i] = (i + 1) + "- " + listaEventos.get(i).getNombre();
			System.out.println(nombreEvento[i]);
		}

		int seleccion;
		do {
			System.out.print("Escriba un número entre 1 y " + listaEventos.size() + ": ");
			seleccion = input.nextInt();
			if (seleccion < 1 || seleccion > listaEventos.size()) {
				System.out.println("Error: el número introducido debe ser entre 1 y " + listaEventos.size());
			}
		} while (seleccion < 1 || seleccion > listaEventos.size());

		Evento eventoSeleccionado = listaEventos.get(seleccion - 1);
		int duracion = eventoSeleccionado.duracionEvento();
		System.out.println("------------------------------------------------------------------");
		System.out.println("El evento '" + eventoSeleccionado.getNombre() + "' dura " + duracion + " días.");

		input.nextLine();
		System.out.println("------------------------------------------------------------------");
		System.out.println("Pulse enter para salir");
		input.nextLine();
	}
}
