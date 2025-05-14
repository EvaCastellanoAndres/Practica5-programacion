package menu;

import java.util.Scanner;

import clases.GestionMuseo;

public class Eliminar {
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
							System.out.println("* Se ha eliminado el museo con los datos introducidos *");
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
							System.out.println("* Se ha eliminado el cuadro con los datos introducidos *");
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
							System.out.println("* Se ha eliminado la escultura con los datos introducidos *");
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
							System.out.println("* Se ha eliminado la obra de arte con los datos introducidos *");
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
							System.out.println("* Se ha eliminado el empleado con los datos introducidos *");
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
							System.out.println("* Se ha eliminado el evento con los datos introducidos *");
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

	public static void eliminarEventoBenefico(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		int confirmaconEliminar = 0;
		do {
			System.out.println("Ha seleccionado - ELIMINAR un evento benéfico -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();

			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el nombre del evento benéfico que desea eliminar:");
				String nombre = input.nextLine();
				if (gestion.existeEventoBenefico(nombre)) {
					do {
						System.out.println(
								"ALERTA: Se va a eliminar el evento benéfico " + gestion.buscarEventoBenefico(nombre).getNombre() + ".");
						System.out.println("¿Desea seguir? \nEliminar -> 1 | Cancelar -> 2");
						confirmaconEliminar = input.nextInt();
						if (confirmaconEliminar == 1) {
							gestion.eliminarEventoBenefico(nombre);
							System.out.println("* Se ha eliminado el evento benéfico con los datos introducidos *");
							input.nextLine();
							break;
						} else if (confirmaconEliminar == 2) {
							input.nextLine();
							break;
						} else {
							System.out.println("Error: " + confirmaconEliminar
									+ " no es una opción contemplada, escriba '1' para eliminar el evento benéfico " + nombre
									+ " o '2' para volver");
						}
					} while (confirmaconEliminar != 1 || confirmaconEliminar != 2);
				} else {
					System.out.println("El evento benéfico con nombre '" + nombre + "' no está registrado");
				}
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar eliminando un evento benéfico o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}

	public static void eliminarEventoGenerico(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		int confirmaconEliminar = 0;
		do {
			System.out.println("Ha seleccionado - ELIMINAR un evento genérico -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();

			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el nombre del evento genérico que desea eliminar:");
				String nombre = input.nextLine();
				if (gestion.existeEventoGenerico(nombre)) {
					do {
						System.out.println(
								"ALERTA: Se va a eliminar el evento genérico " + gestion.buscarEventoGenerico(nombre).getNombre() + ".");
						System.out.println("¿Desea seguir? \nEliminar -> 1 | Cancelar -> 2");
						confirmaconEliminar = input.nextInt();
						if (confirmaconEliminar == 1) {
							gestion.eliminarEventoGenerico(nombre);
							System.out.println("* Se ha eliminado el evento genérico con los datos introducidos *");
							input.nextLine();
							break;
						} else if (confirmaconEliminar == 2) {
							input.nextLine();
							break;
						} else {
							System.out.println("Error: " + confirmaconEliminar
									+ " no es una opción contemplada, escriba '1' para eliminar el evento genérico " + nombre
									+ " o '2' para volver");
						}
					} while (confirmaconEliminar != 1 || confirmaconEliminar != 2);
				} else {
					System.out.println("El evento genérico con nombre '" + nombre + "' no está registrado");
				}
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar eliminando un evento genérico o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}

}
