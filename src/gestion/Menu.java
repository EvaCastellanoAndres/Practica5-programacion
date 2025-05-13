package gestion;

import java.util.Scanner;

import clases.GestionMuseo;

public class Menu {
	public static void menu() {
		System.out.println("Elija una opción:");
		System.out.println("  1 _ Dar de alta");
		System.out.println("    |- 1.1 -> Museo");
		System.out.println("    |- 1.2 -> Cuadro");
		System.out.println("    |- 1.3 -> Obra de Arte");
		System.out.println("    |- 1.4 -> Empleado");
		System.out.println("    |- 1.5 -> Evento");
		System.out.println("    |- 1.6 -> Evento benéfico");
		System.out.println("    |- 1.7 -> Evento genérico");
		System.out.println();
		System.out.println("  2 _ Buscar");
		System.out.println("    |- 2.1 -> Museo");
		System.out.println("    |- 2.2 -> Cuadro");
		System.out.println("    |- 2.3 -> Obra de Arte");
		System.out.println("    |- 2.4 -> Empleado");
		System.out.println("    |- 2.5 -> Evento");
		System.out.println("    |- 2.6 -> Evento benéfico");
		System.out.println("    |- 2.7 -> Evento genérico");
		System.out.println();
		System.out.println("  3 _ Listar");
		System.out.println("    |- 3.1 -> Museos");
		System.out.println("    |- 3.2 -> Cuadros");
		System.out.println("    |- 3.3 -> Obras de Arte");
		System.out.println("    |- 3.4 -> Empleados");
		System.out.println("    |- 3.5 -> Eventos");
		System.out.println("    |- 3.6 -> Eventos benéficos");
		System.out.println("    |- 3.7 -> Eventos genéricos");
		System.out.println();
		System.out.println("  4 _ Eliminar");
		System.out.println("    |- 4.1 -> Museo");
		System.out.println("    |- 4.2 -> Cuadro");
		System.out.println("    |- 4.3 -> Obra de Arte");
		System.out.println("    |- 4.4 -> Empleado");
		System.out.println("    |- 4.5 -> Evento");
		System.out.println("    |- 4.6 -> Evento benéfico");
		System.out.println("    |- 4.7 -> Evento genérico");
		System.out.println();
		System.out.println(" 5 -> Salir");
	}

	public static void altaMuseo(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		do {
			System.out.println("Has seleccionado - Dar de alta un museo -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();

			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el nombre:");
				String nombre = input.nextLine();
				System.out.println("Escriba el aforo:");
				int aforo = input.nextInt();
				System.out.println("Escriba el precio de la entrada:");
				double precio = input.nextDouble();
				gestion.altaMuseo(nombre, aforo, precio);
				System.out.println("* Se ha creado el museo con los datos introducidos *");
				input.nextLine();
				break;
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: "+confirmacion+" no es una opción contemplada, escriba '1' para continuar creando un museo o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}
	/*
	 * public Cuadro(String titulo, int siglo, String estilo) {
		super(titulo, siglo);
		this.estilo = estilo;
	}
	*/
	public static void altaCuadro(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		do {
			System.out.println("Has seleccionado - Dar de alta un museo -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();

			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el nombre:");
				String nombre = input.nextLine();
				System.out.println("Escriba el aforo:");
				int aforo = input.nextInt();
				System.out.println("Escriba el precio de la entrada:");
				double precio = input.nextDouble();
				gestion.altaMuseo(nombre, aforo, precio);
				System.out.println("* Se ha creado el museo con los datos introducidos *");
				input.nextLine();
				break;
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: "+confirmacion+" no es una opción contemplada, escriba '1' para continuar creando un museo o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}
}
