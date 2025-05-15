package menu;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Evento;

public class ComprobarEstadoEvento {
	/**
	 * El método comprueba el estado actual de un evento seleccionado de una lista.
	 * Muestra todos los eventos disponibles en una lista numerada, pide que se
	 * seleccione uno por su número y, tras validar la entrada, llama al método
	 * "estadoEvento()" del evento seleccionado. Este método muestra si el evento ya
	 * ha terminado, si está en curso o si todavía no ha comenzado, indicando los
	 * días que faltan o han pasado desde su inicio o fin. También espera a que el
	 * usuario pulse enter para finalizar.
	 * 
	 * @param input        Scanner que permite escribir por consola
	 * @param listaEventos ArrayList de eventos entre los que el usuario puede
	 *                     elegir
	 */
	public static void comprobarEstado(Scanner input, ArrayList<Evento> listaEventos) {
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
		System.out.println("------------------------------------------------------------------");
		eventoSeleccionado.estadoEvento();
		System.out.println("------------------------------------------------------------------");
		System.out.println("Pulse enter para salir");
		input.nextLine();
		input.nextLine();
	}
}
