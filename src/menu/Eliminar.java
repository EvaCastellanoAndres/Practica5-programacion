package menu;

import java.util.Scanner;

import clases.GestionMuseo;

public class Eliminar {
	/**
	 * Método que elimina el objeto Museo que coincida con el nombre introducido por
	 * consola
	 * 
	 * @param input   Scanner para poder escribir por consola
	 * @param gestion Objeto de GestionMuseo encargado de hacer funciones esenciales
	 *                para la eliminación del museo
	 */
	public static void eliminarMuseo(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		int confirmaconEliminar = 0;
		do {
			System.out.println("Ha seleccionado - ELIMINAR un museo -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();

			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el nombre del museo que desea eliminar:");
				String nombre = input.nextLine();
				if (gestion.existeMuseo(nombre)) {
					do {
						System.out.println(
								"ALERTA: Se va a eliminar el museo " + gestion.devolverMuseo(nombre).getNombre() + ".");
						System.out.println("¿Desea seguir? \nEliminar -> 1 | Cancelar -> 2");
						confirmaconEliminar = input.nextInt();
						if (confirmaconEliminar == 1) {
							gestion.eliminarMuseo(nombre);
							System.out.println("\n* Se ha eliminado el museo con los datos introducidos *\n");
							input.nextLine();
							break;
						} else if (confirmaconEliminar == 2) {
							input.nextLine();
							break;
						} else {
							System.out.println("Error: " + confirmaconEliminar
									+ " no es una opción contemplada, escriba '1' para eliminar el museo " + nombre
									+ " o '2' para volver");
						}
					} while (confirmaconEliminar != 1 || confirmaconEliminar != 2);
				} else {
					System.out.println("El museo con nombre '" + nombre + "' no está registrado");
				}
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar eliminando un museo o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}

	/**
	 * Método que elimina el objeto Cuadro que coincida con el nombre introducido
	 * por consola
	 * 
	 * @param input   Scanner para poder escribir por consola
	 * @param gestion Objeto de GestionMuseo encargado de hacer funciones esenciales
	 *                para la eliminación del cuadro
	 */
	public static void eliminarCuadro(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		int confirmaconEliminar = 0;
		do {
			System.out.println("Ha seleccionado - ELIMINAR un cuadro -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();

			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el título del cuadro que desea eliminar:");
				String titulo = input.nextLine();
				if (gestion.existeCuadro(titulo)) {
					do {
						System.out.println("ALERTA: Se va a eliminar el cuadro '"
								+ gestion.buscarCuadro(titulo).getTitulo() + "'.");
						System.out.println("¿Desea seguir? \nEliminar -> 1 | Cancelar -> 2");
						confirmaconEliminar = input.nextInt();
						if (confirmaconEliminar == 1) {
							gestion.eliminarCuadro(titulo);
							System.out.println("\n* Se ha eliminado el cuadro con los datos introducidos *\n");
							input.nextLine();
							break;
						} else if (confirmaconEliminar == 2) {
							input.nextLine();
							break;
						} else {
							System.out.println("Error: " + confirmaconEliminar
									+ " no es una opción contemplada, escriba '1' para eliminar el cuadro '" + titulo
									+ "' o '2' para volver");
						}
					} while (confirmaconEliminar != 1 || confirmaconEliminar != 2);
				} else {
					System.out.println("El cuadro con título '" + titulo + "' no está registrado");
				}
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar eliminando un cuadro o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}

	/**
	 * Método que elimina el objeto Escultura que coincida con el nombre introducido
	 * por consola
	 * 
	 * @param input   Scanner para poder escribir por consola
	 * @param gestion Objeto de GestionMuseo encargado de hacer funciones esenciales
	 *                para la eliminación de la escultura
	 */
	public static void eliminarEscultura(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		int confirmaconEliminar = 0;
		do {
			System.out.println("Ha seleccionado - ELIMINAR una escultura -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();

			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el título de la escultura que desea eliminar:");
				String titulo = input.nextLine();
				if (gestion.existeEscultura(titulo)) {
					do {
						System.out.println("ALERTA: Se va a eliminar la escultura '"
								+ gestion.buscarEscultura(titulo).getTitulo() + "'.");
						System.out.println("¿Desea seguir? \nEliminar -> 1 | Cancelar -> 2");
						confirmaconEliminar = input.nextInt();
						if (confirmaconEliminar == 1) {
							gestion.eliminarEscultura(titulo);
							System.out.println("\n* Se ha eliminado la escultura con los datos introducidos *\n");
							input.nextLine();
							break;
						} else if (confirmaconEliminar == 2) {
							input.nextLine();
							break;
						} else {
							System.out.println("Error: " + confirmaconEliminar
									+ " no es una opción contemplada, escriba '1' para eliminar la escultura '" + titulo
									+ "' o '2' para volver");
						}
					} while (confirmaconEliminar != 1 || confirmaconEliminar != 2);
				} else {
					System.out.println("La escultura con título '" + titulo + "' no está registrada");
				}
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar eliminando una escultura o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}

	/**
	 * Método que elimina el objeto ObraDeArte que coincida con el nombre
	 * introducido por consola
	 * 
	 * @param input   Scanner para poder escribir por consola
	 * @param gestion Objeto de GestionMuseo encargado de hacer funciones esenciales
	 *                para la eliminación de la obra de arte
	 */
	public static void eliminarObraDeArte(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		int confirmaconEliminar = 0;
		do {
			System.out.println("Ha seleccionado - ELIMINAR una obra de arte -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();

			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el título de la obra de arte que desea eliminar:");
				String titulo = input.nextLine();
				if (gestion.existeObraDeArte(titulo)) {
					do {
						System.out.println("ALERTA: Se va a eliminar la obra de arte '"
								+ gestion.buscarObraDeArte(titulo).getTitulo() + "'.");
						System.out.println("¿Desea seguir? \nEliminar -> 1 | Cancelar -> 2");
						confirmaconEliminar = input.nextInt();
						if (confirmaconEliminar == 1) {
							gestion.eliminarObraDeArte(titulo);
							System.out.println("\n* Se ha eliminado la obra de arte con los datos introducidos *\n");
							input.nextLine();
							break;
						} else if (confirmaconEliminar == 2) {
							input.nextLine();
							break;
						} else {
							System.out.println("Error: " + confirmaconEliminar
									+ " no es una opción contemplada, escriba '1' para eliminar la obra de arte '"
									+ titulo + "' o '2' para volver");
						}
					} while (confirmaconEliminar != 1 || confirmaconEliminar != 2);
				} else {
					System.out.println("La obra de arte con título '" + titulo + "' no está registrada");
				}
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar eliminando una obra de arte o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}

	/**
	 * Método que elimina el objeto Empleado que coincida con el nombre introducido
	 * por consola
	 * 
	 * @param input   Scanner para poder escribir por consola
	 * @param gestion Objeto de GestionMuseo encargado de hacer funciones esenciales
	 *                para la eliminación del empleado
	 */
	public static void eliminarEmpleado(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		int confirmaconEliminar = 0;
		do {
			System.out.println("Ha seleccionado - ELIMINAR un empleado -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();

			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el DNI del empleado que desea eliminar:");
				String dni = input.nextLine();
				if (gestion.existeEmpleado(dni)) {
					do {
						System.out.println(
								"ALERTA: Se va a eliminar el empleado " + gestion.buscarEmpleado(dni).getNombre() + " "
										+ gestion.buscarEmpleado(dni).getApellidos() + " (DNI-"
										+ gestion.buscarEmpleado(dni).getDni() + ").");
						System.out.println("¿Desea seguir? \nEliminar -> 1 | Cancelar -> 2");
						confirmaconEliminar = input.nextInt();
						if (confirmaconEliminar == 1) {
							gestion.eliminarEmpleado(dni);
							System.out.println("\n* Se ha eliminado el empleado con los datos introducidos *\n");
							input.nextLine();
							break;
						} else if (confirmaconEliminar == 2) {
							input.nextLine();
							break;
						} else {
							System.out.println("Error: " + confirmaconEliminar
									+ " no es una opción contemplada, escriba '1' para eliminar el empleado " + dni
									+ " o '2' para volver");
						}
					} while (confirmaconEliminar != 1 || confirmaconEliminar != 2);
				} else {
					System.out.println("El empleado con DNI '" + dni + "' no está registrado");
				}
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar eliminando un empleado o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}

	/**
	 * Método que elimina el objeto Evento que coincida con el nombre introducido
	 * por consola. Si el evento pertenece a la lista de eventos benéficos o eventos
	 * genéricos, lo elimina también de dicha lista.
	 * 
	 * @param input   Scanner para poder escribir por consola
	 * @param gestion Objeto de GestionMuseo encargado de hacer funciones esenciales
	 *                para la eliminación del evento
	 */
	public static void eliminarEvento(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		int confirmaconEliminar = 0;
		do {
			System.out.println("Ha seleccionado - ELIMINAR un evento -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();

			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el nombre del evento que desea eliminar:");
				String nombre = input.nextLine();
				if (gestion.existeEvento(nombre)) {
					do {
						System.out.println(
								"ALERTA: Se va a eliminar el evento " + gestion.buscarEvento(nombre).getNombre() + ".");
						System.out.println("¿Desea seguir? \nEliminar -> 1 | Cancelar -> 2");
						confirmaconEliminar = input.nextInt();
						if (confirmaconEliminar == 1) {
							gestion.eliminarEvento(nombre);
							System.out.println("\n* Se ha eliminado el evento con los datos introducidos *\n");
							if (gestion.existeEventoBenefico(nombre)) {
								gestion.eliminarEventoBenefico(nombre);
							}
							if (gestion.existeEventoGenerico(nombre)) {
								gestion.eliminarEventoGenerico(nombre);
							}

							input.nextLine();
							break;
						} else if (confirmaconEliminar == 2) {
							input.nextLine();
							break;
						} else {
							System.out.println("Error: " + confirmaconEliminar
									+ " no es una opción contemplada, escriba '1' para eliminar el evento " + nombre
									+ " o '2' para volver");
						}
					} while (confirmaconEliminar != 1 || confirmaconEliminar != 2);
				} else {
					System.out.println("El evento con nombre '" + nombre + "' no está registrado");
				}
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar eliminando un evento o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}

}
