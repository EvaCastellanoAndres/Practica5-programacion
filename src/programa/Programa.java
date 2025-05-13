package programa;

import java.util.Scanner;

import clases.GestionMuseo;
import gestion.Menu;
import gestion.instanciarClases;

public class Programa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GestionMuseo gestion = new GestionMuseo();
		instanciarClases.crearMuseos(gestion);
		instanciarClases.crearCuadros(gestion);
		instanciarClases.crearEsculturas(gestion);
		instanciarClases.crearObrasDeArte(gestion);
		instanciarClases.crearEventos(gestion);
		instanciarClases.crearEventosBeneficos(gestion);
		instanciarClases.crearEventosGenericos(gestion);

//		gestion.listarMuseos();
//		System.out.println("---------------------------------------------------------------------");
//		gestion.listarObrasDeArte();

		String opcion;

		do {
			Menu.menu();
			opcion = input.nextLine();

			switch (opcion) {
			case "1.1": // Alta museo
				Menu.altaMuseo(input, gestion);
				break;

			case "1.2":// Alta cuadro

				break;

			case "2.1":// Buscar museo

				break;

			default:
				System.out.println("Opción no válida");
				break;
			}
		} while (!opcion.equals("5"));

		input.close();
	}

}
