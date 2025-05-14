package menu;

import java.util.Scanner;

import clases.GestionMuseo;

public class Listar {
	public static void listarMuseos(Scanner input, GestionMuseo gestion, String seguir) {
		System.out.println("    ------ Lista museos ------");
		gestion.listarMuseos();
		System.out.println("Pulse enter para salir");
		seguir = input.nextLine();
	}

	public static void listarCuadros(Scanner input, GestionMuseo gestion, String seguir) {
		System.out.println("    ------ Lista cuadros ------");
		gestion.listarCuadros();
		System.out.println("Pulse enter para salir");
		seguir = input.nextLine();
	}

	public static void listarEsculturas(Scanner input, GestionMuseo gestion, String seguir) {
		System.out.println("    ------ Lista esculturas ------");
		gestion.listarEsculturas();
		System.out.println("Pulse enter para salir");
		seguir = input.nextLine();
	}

	public static void listarObrasDeArte(Scanner input, GestionMuseo gestion, String seguir) {
		System.out.println("    ------ Lista obras de arte ------");
		gestion.listarObrasDeArte();
		System.out.println("Pulse enter para salir");
		seguir = input.nextLine();
	}

	public static void listarEmpleados(Scanner input, GestionMuseo gestion, String seguir) {
		System.out.println("    ------ Lista empleados ------");
		gestion.listarEmpleados();
		System.out.println("Pulse enter para salir");
		seguir = input.nextLine();
	}

	public static void listarEventos(Scanner input, GestionMuseo gestion, String seguir) {
		System.out.println("    ------ Lista eventos ------");
		gestion.listarEventos();
		System.out.println("Pulse enter para salir");
		seguir = input.nextLine();
	}

	public static void listarEventosBeneficos(Scanner input, GestionMuseo gestion, String seguir) {
		System.out.println("    ------ Lista eventos beneficos ------");
		gestion.listarEventosBeneficos();
		System.out.println("Pulse enter para salir");
		seguir = input.nextLine();
	}

	public static void listarEventosGenericos(Scanner input, GestionMuseo gestion, String seguir) {
		System.out.println("    ------ Lista eventos genericos ------");
		gestion.listarEventosGenericos();
		System.out.println("Pulse enter para salir");
		seguir = input.nextLine();
	}
}
