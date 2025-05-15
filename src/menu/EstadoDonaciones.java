package menu;

import java.util.ArrayList;
import java.util.Scanner;

import clases.EventoBenefico;

public class EstadoDonaciones {
	/**
	 * Método que muestra una lista numerada con todos los eventos existentes y
	 * muestra la meta de recaudación y el total recaudado de cada uno.
	 * 
	 * @param input                 Scanner que permite escribir por consola
	 * @param listaEventosBeneficos ArrayList de todos los objetos de tipo
	 *                              EventoBenefico
	 */
	public static void mostrarEstado(Scanner input, ArrayList<EventoBenefico> listaEventosBeneficos) {
		String[] nombreEvento = new String[listaEventosBeneficos.size()];
		for (int i = 0; i < listaEventosBeneficos.size(); i++) {
			nombreEvento[i] = (i + 1) + "- " + listaEventosBeneficos.get(i).getNombre();
			System.out.println(nombreEvento[i] + ": ");
			System.out.println("   - Meta recaudación: " + listaEventosBeneficos.get(i).getMetaRecaudacion());
			System.out.println("   - Total recaudado: " + listaEventosBeneficos.get(i).getTotalRecaudado());
			System.out.println();
		}
		System.out.println("Pulse enter para salir");
		input.nextLine();
	}
}
