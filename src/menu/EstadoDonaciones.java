package menu;

import java.util.ArrayList;
import java.util.Scanner;

import clases.EventoBenefico;
import clases.GestionMuseo;

public class EstadoDonaciones {
	public static void mostrarEstado(Scanner input, GestionMuseo gestion,
			ArrayList<EventoBenefico> listaEventosBeneficos, String seguir) {
		String[] nombreEvento = new String[listaEventosBeneficos.size()];

		for (int i = 0; i < listaEventosBeneficos.size(); i++) {
			nombreEvento[i] = (i + 1) + "- " + listaEventosBeneficos.get(i).getNombre();
			System.out.println(nombreEvento[i] + ": ");
			System.out.println("   - Meta recaudación: " + listaEventosBeneficos.get(i).getMetaRecaudacion());
			System.out.println("   - Total recaudado: " + listaEventosBeneficos.get(i).getTotalRecaudado());
		}
		System.out.println("Pulse enter para salir");
		seguir = input.nextLine();
	}
}
