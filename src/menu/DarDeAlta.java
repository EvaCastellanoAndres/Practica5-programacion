package menu;

import java.util.Scanner;
import clases.GestionMuseo;

public class DarDeAlta {
	public static void altaMuseo(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		do {
			System.out.println("Ha seleccionado - Dar de alta un museo -");
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
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar creando un museo o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}

	/*
	 * public Cuadro(String titulo, int siglo, String estilo) { super(titulo,
	 * siglo); this.estilo = estilo; }
	 */
	public static void altaCuadro(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		do {
			System.out.println("Ha seleccionado - Dar de alta un cuadro -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();

			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el título:");
				String titulo = input.nextLine();
				System.out.println("Escriba el siglo:");
				int siglo = input.nextInt();
				System.out.println("Escriba el estilo:");
				String estilo = input.nextLine();
				gestion.altaCuadro(titulo, siglo, estilo);
				System.out.println("* Se ha creado el cuadro con los datos introducidos *");
				input.nextLine();
				break;
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar creando un cuadro o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}

	public static void altaEscultura(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		do {
			System.out.println("Ha seleccionado - Dar de alta una escultura -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();

			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el título:");
				String titulo = input.nextLine();
				System.out.println("Escriba el siglo:");
				int siglo = input.nextInt();
				System.out.println("Escriba el material:");
				String material = input.nextLine();
				gestion.altaCuadro(titulo, siglo, material);
				System.out.println("* Se ha creado el cuadro con los datos introducidos *");
				input.nextLine();
				break;
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar creando un cuadro o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}

	public static void altaObraDeArte(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		do {
			System.out.println("Ha seleccionado - Dar de alta una obra de arte -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();

			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el título:");
				String titulo = input.nextLine();
				System.out.println("Escriba el siglo:");
				int siglo = input.nextInt();
				gestion.altaObraDeArte(titulo, siglo);
				System.out.println("* Se ha creado la obra de arte con los datos introducidos *");
				input.nextLine();
				break;
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar creando una obra de arte o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}

	public static void altaEmpleado(Scanner input, GestionMuseo gestion) {

		int confirmacion = 0;
		do {
			System.out.println("Ha seleccionado - Dar de alta un empleado -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();

			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el nombre:");
				String nombre = input.nextLine();
				System.out.println("Escriba los apellidos:");
				String apellidos = input.nextLine();
				System.out.println("Escriba el DNI:");
				String dni = input.nextLine();
				System.out.println("Escriba el sueldo:");
				double sueldo = input.nextDouble();
				System.out.println("Escriba el nombre del museo en el que trabaja:");
				String museo = input.nextLine();
				gestion.altaEmpleado(nombre, apellidos, dni, sueldo, museo);
				System.out.println("* Se ha creado el empleado con los datos introducidos *");
				input.nextLine();
				break;
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar creando un empleado o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}

	public static void altaEvento(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		do {
			System.out.println("Ha seleccionado - Dar de alta un evento -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();

			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el nombre del evento:");
				String nombre = input.nextLine();
				String dni = "";
				do {
					System.out.println("Escriba el DNI del empleado que lo organice:");
					dni = input.nextLine();
					if (gestion.existeEmpleado(dni)) {
						System.out.println("Escriba la fecha de inicio (YYYY-MM-DD):");
						String fechaI = input.nextLine();
						System.out.println("Escriba la fecha de finalización (YYYY-MM-DD):");
						String fechaF = input.nextLine();
						System.out.println("Escriba la temática:");
						String tema = input.nextLine();
						String museo = "";
						do {
							System.out.println("Escriba el nombre del museo en el que se realiza:");
							museo = input.nextLine();
							if (gestion.existeMuseo(museo)) {
								gestion.altaEvento(nombre, dni, fechaI, fechaF, tema, museo);
								System.out.println("* Se ha creado el evento con los datos introducidos *");
								break;
							} else {
								System.out.println("Error: El museo introducido no corresponde con ninguno registrado");
							}

						} while (!gestion.existeMuseo(museo));
						break;

					} else {
						System.out.println("Error: El DNI introducido no corresponde con ningún empleado");
					}
				} while (!gestion.existeEmpleado(dni));
				break;
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar creando un evento o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}

	public static void altaEventoBenefico(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		do {
			System.out.println("Ha seleccionado - Dar de alta un evento benéfico -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();

			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el nombre del evento:");
				String nombre = input.nextLine();
				String dni = "";
				do {
					System.out.println("Escriba el DNI del empleado que lo organice:");
					dni = input.nextLine();
					if (gestion.existeEmpleado(dni)) {
						System.out.println("Escriba la fecha de inicio (YYYY-MM-DD):");
						String fechaI = input.nextLine();
						System.out.println("Escriba la fecha de finalización (YYYY-MM-DD):");
						String fechaF = input.nextLine();
						System.out.println("Escriba la temática:");
						String tema = input.nextLine();
						String museo = "";
						do {
							System.out.println("Escriba el nombre del museo en el que se realiza:");
							museo = input.nextLine();
							if (gestion.existeMuseo(museo)) {
								System.out.println("Escriba la causa del evento:");
								String causa = input.nextLine();
								System.out.println("Escriba la meta de recaudación:");
								double meta = input.nextDouble();
								System.out.println("Escriba el total recaudado:");
								double total = input.nextDouble();
								gestion.altaEventoBenefico(nombre, dni, fechaI, fechaF, tema, museo, causa, meta,
										total);
								System.out.println("* Se ha creado el evento benefico con los datos introducidos *");
								input.nextLine();
								break;
							} else {
								System.out.println("Error: El museo introducido no corresponde con ninguno registrado");
							}

						} while (!gestion.existeMuseo(museo));
						break;

					} else {
						System.out.println("Error: El DNI introducido no corresponde con ningún empleado");
					}
				} while (!gestion.existeEmpleado(dni));
				break;
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar creando un evento benéfico o '2' para volver");
			}
		} while (confirmacion != 1 || confirmacion != 2);
	}

	/*
	 * (String nombre, Empleado organizador, LocalDate fechaInicio, LocalDate
	 * fechaFin, String tema, Museo museo, String tipo, String publicoObjetivo,
	 * boolean requiereInscripcion)
	 */
	public static void altaEventoGenerico(Scanner input, GestionMuseo gestion) {
		int confirmacion = 0;
		do {
			System.out.println("Ha seleccionado - Dar de alta un evento genérico -");
			System.out.println("¿Desea seguir o volver al menu anterior?");
			System.out.println("Seguir -> 1 | Volver -> 2");
			confirmacion = input.nextInt();

			if (confirmacion == 1) {
				input.nextLine();
				System.out.println("Escriba el nombre del evento:");
				String nombre = input.nextLine();
				String dni = "";
				do {
					System.out.println("Escriba el DNI del empleado que lo organice:");
					dni = input.nextLine();
					if (gestion.existeEmpleado(dni)) {
						System.out.println("Escriba la fecha de inicio (YYYY-MM-DD):");
						String fechaI = input.nextLine();
						System.out.println("Escriba la fecha de finalización (YYYY-MM-DD):");
						String fechaF = input.nextLine();
						System.out.println("Escriba la temática:");
						String tema = input.nextLine();
						String museo = "";
						do {
							System.out.println("Escriba el nombre del museo en el que se realiza:");
							museo = input.nextLine();
							if (gestion.existeMuseo(museo)) {
								System.out.println("Escriba el tipo de evento:");
								String tipo = input.nextLine();
								System.out.println("Escriba el publico objetivo:");
								String publico = input.nextLine();

								char inscripcion;
								System.out.println("¿Requiere inscripción? (S/N)");
								boolean booleano = false;
								do {
									inscripcion = input.nextLine().charAt(0);

									if (inscripcion == 'S') {
										booleano = true;
									} else if (inscripcion == 'N') {
										booleano = false;
									} else {
										System.out.println("Esciba 'S' para sí o 'N' para no");
									}
								} while (inscripcion != 'S' && inscripcion != 'N');

								gestion.altaEventoGenerico(nombre, dni, fechaI, fechaF, tema, museo, tipo, publico,
										booleano);
								System.out.println("* Se ha creado el evento genérico con los datos introducidos *");
								input.nextLine();
								break;
							} else {
								System.out.println("Error: El museo introducido no corresponde con ninguno registrado");
							}

						} while (!gestion.existeMuseo(museo));
						break;

					} else {
						System.out.println("Error: El DNI introducido no corresponde con ningún empleado");
					}
				} while (!gestion.existeEmpleado(dni));
				break;
			} else if (confirmacion == 2) {
				input.nextLine();
				break;
			} else {
				System.out.println("Error: " + confirmacion
						+ " no es una opción contemplada, escriba '1' para continuar creando un evento genérico o '2' para volver");
			}
		} while (confirmacion != 1 && confirmacion != 2);
	}
}
