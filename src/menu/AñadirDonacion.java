package menu;

import java.util.ArrayList;
import java.util.Scanner;

import clases.EventoBenefico;
import clases.GestionMuseo;

public class AñadirDonacion {
	/**
	 * Permite seleccionar un evento benéfico de una lista e introducir una
	 * donación. La cantidad debe ser positiva. Si se introduce -1, se cancela la
	 * operación.
	 * 
	 * @param input                 Scanner para poder escribir por consola
	 * @param gestion               Objeto que gestiona los eventos y museos
	 * @param listaEventosBeneficos ArrayList de eventos benéficos disponibles
	 * @param seguir                Variable para controlar la pausa tras la
	 *                              donación
	 */
	public static void añadirDonacion(Scanner input, GestionMuseo gestion,
			ArrayList<EventoBenefico> listaEventosBeneficos) {
		String[] nombreEvento = new String[listaEventosBeneficos.size()];
		System.out.println("-- Seleccione el evento al que desea añadir la donación --");

		for (int i = 0; i < listaEventosBeneficos.size(); i++) {
			nombreEvento[i] = (i + 1) + "- " + listaEventosBeneficos.get(i).getNombre();
			System.out.println(nombreEvento[i]);
		}

		int seleccion;
		do {
			System.out.print("Escriba un número entre 1 y " + listaEventosBeneficos.size() + ": ");
			seleccion = input.nextInt();
			if (seleccion < 1 || seleccion > listaEventosBeneficos.size()) {
				System.out.println("Error: el número introducido debe ser entre 1 y " + listaEventosBeneficos.size());
			}
		} while (seleccion < 1 || seleccion > listaEventosBeneficos.size());

		EventoBenefico eventoSeleccionado = listaEventosBeneficos.get(seleccion - 1);
		double cantidad;

		do {
			System.out.println("Escriba la cantidad que desea donar (-1 para salir)");
			cantidad = input.nextDouble();
			if (cantidad < -1) {
				System.out.println("La cantidad no puede ser menor a 0");
			}
		} while (cantidad < -1);

		if (cantidad > 0) {
			eventoSeleccionado.añadirDonacion(cantidad);
			System.out.println("* La donación se ha realizado con éxito *");
			System.out.println("Pulse enter para salir");
			input.nextLine();
		}
		input.nextLine();
	}
}
