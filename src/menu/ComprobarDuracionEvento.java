package menu;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Evento;
import clases.GestionMuseo;

public class ComprobarDuracionEvento {

	public static void comprobarEstado(Scanner input, GestionMuseo gestion, ArrayList<Evento> listaEventos,
			String seguir) {
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
		int duracion=eventoSeleccionado.duracionEvento();
		System.out.println("El evento '"+eventoSeleccionado.getNombre() +"' dura "+duracion+" dias.");
		
		input.nextLine();
		System.out.println("----------------------\nPulse enter para salir");
		seguir = input.nextLine();
	}
}
