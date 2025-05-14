package menu;

import java.util.Scanner;

import clases.GestionMuseo;

public class Buscar {
	public static void buscarMuseo(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		do {
			System.out.println("Ha seleccionado - Buscar un museo -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();
			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el nombre del museo que quiera buscar");
				String nombreMuseo = input.nextLine();
				if (gestion.existeMuseo(nombreMuseo)) {
					System.out.println("-------------------------------------------------");
					System.out.println(gestion.devolverMuseo(nombreMuseo));
					System.out.println("-------------------------------------------------");
				} else {
					System.out.println("El museo con nombre '" + nombreMuseo + "' no está registrado");
				}
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar buscando un museo o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}

	public static void buscarCuadro(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		do {
			System.out.println("Ha seleccionado - Buscar un cuadro -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();
			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el título del cuadro que quiera buscar");
				String titulo = input.nextLine();
				if (gestion.existeCuadro(titulo)) {
					System.out.println("-------------------------------------------------");
					System.out.println(gestion.buscarCuadro(titulo));
					System.out.println("-------------------------------------------------");
				} else {
					System.out.println("El cuadro con título '" + titulo + "' no está registrado");
				}
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar buscando un cuadro o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}

	public static void buscarEscultura(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		do {
			System.out.println("Ha seleccionado - Buscar una escultura -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();
			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el título de la escultura que quiera buscar");
				String titulo = input.nextLine();
				if (gestion.existeEscultura(titulo)) {
					System.out.println("-------------------------------------------------");
					System.out.println(gestion.buscarEscultura(titulo));
					System.out.println("-------------------------------------------------");
				} else {
					System.out.println("La escultura con título '" + titulo + "' no está registrada");
				}
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar buscando una escultura o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}

	public static void buscarObraDeArte(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		do {
			System.out.println("Ha seleccionado - Buscar una obra de arte -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();
			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el título de la escultura que quiera buscar");
				String titulo = input.nextLine();
				if (gestion.existeObraDeArte(titulo)) {
					System.out.println("-------------------------------------------------");
					System.out.println(gestion.buscarObraDeArte(titulo));
					System.out.println("-------------------------------------------------");
				} else {
					System.out.println("La obra de arte con título '" + titulo + "' no está registrada");
				}
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar buscando una obra de arte o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}

	public static void buscarEmpleado(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		do {
			System.out.println("Ha seleccionado - Buscar un empleado -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();
			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el DNI del empleado que quiera buscar");
				String dni = input.nextLine();
				if (gestion.existeEmpleado(dni)) {
					System.out.println("-------------------------------------------------");
					System.out.println(gestion.buscarEmpleado(dni));
					System.out.println("-------------------------------------------------");
				} else {
					System.out.println("El empleado con DNI '" + dni + "' no está registrado");
				}
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar buscando un empleado o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}
	
	public static void buscarEvento(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		do {
			System.out.println("Ha seleccionado - Buscar un evento -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();
			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el nombre del evento que quiera buscar");
				String nombre = input.nextLine();
				if (gestion.existeEvento(nombre)) {
					System.out.println("-------------------------------------------------");
					System.out.println(gestion.buscarEvento(nombre));
					System.out.println("-------------------------------------------------");
				} else {
					System.out.println("El evento con nombre '" + nombre + "' no está registrado");
				}
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar buscando un evento o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}
	
	public static void buscarEventoBenefico(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		do {
			System.out.println("Ha seleccionado - Buscar un evento benefico -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();
			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el nombre del evento benefico que quiera buscar");
				String nombre = input.nextLine();
				if (gestion.existeEventoBenefico(nombre)) {
					System.out.println("-------------------------------------------------");
					System.out.println(gestion.buscarEventoBenefico(nombre));
					System.out.println("-------------------------------------------------");
				} else {
					System.out.println("El evento benefico con nombre '" + nombre + "' no está registrado");
				}
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar buscando un evento benefico o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}
	
	public static void buscarEventoGenerico(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		do {
			System.out.println("Ha seleccionado - Buscar un evento generico -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();
			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el nombre del evento generico que quiera buscar");
				String nombre = input.nextLine();
				if (gestion.existeEventoGenerico(nombre)) {
					System.out.println("-------------------------------------------------");
					System.out.println(gestion.buscarEventoGenerico(nombre));
					System.out.println("-------------------------------------------------");
				} else {
					System.out.println("El evento generico con nombre '" + nombre + "' no está registrado");
				}
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar buscando un evento generico o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}

}
