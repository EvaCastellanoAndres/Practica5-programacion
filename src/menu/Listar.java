package menu;

import java.util.Scanner;

import clases.EventoGenerico;
import clases.GestionMuseo;

public class Listar {
	/**
	 * Lista todos los objetos de tipo Museo registrados. Con un pequeño título y
	 * teniendo que pulsar enter para salir del listado.
	 * 
	 * @param input   Scanner que permite escribir por consola
	 * @param gestion Objeto de GestionMuseo que llama al metodo 'listarMuseos()'
	 */
	public static void listarMuseos(Scanner input, GestionMuseo gestion) {
		System.out.println("    ------ Lista museos ------");
		gestion.listarMuseos();
		System.out.println("Pulse enter para salir");
		input.nextLine();
	}

	/**
	 * Lista todos los objetos de tipo Cuadro registrados. Con un pequeño título y
	 * teniendo que pulsar enter para salir del listado.
	 * 
	 * @param input   Scanner que permite escribir por consola
	 * @param gestion Objeto de GestionMuseo que llama al metodo 'listarCuadros()'
	 */
	public static void listarCuadros(Scanner input, GestionMuseo gestion) {
		System.out.println("    ------ Lista cuadros ------");
		gestion.listarCuadros();
		System.out.println("Pulse enter para salir");
		input.nextLine();
	}

	/**
	 * Lista todos los objetos de tipo Escultura registrados. Con un pequeño título
	 * y teniendo que pulsar enter para salir del listado.
	 * 
	 * @param input   Scanner que permite escribir por consola
	 * @param gestion Objeto de GestionMuseo que llama al metodo
	 *                'listarEsculturas()'
	 */
	public static void listarEsculturas(Scanner input, GestionMuseo gestion) {
		System.out.println("    ------ Lista esculturas ------");
		gestion.listarEsculturas();
		System.out.println("Pulse enter para salir");
		input.nextLine();
	}

	/**
	 * Lista todos los objetos de tipo ObraDeArte registrados. Con un pequeño título
	 * y teniendo que pulsar enter para salir del listado.
	 * 
	 * @param input   Scanner que permite escribir por consola
	 * @param gestion Objeto de GestionMuseo que llama al metodo
	 *                'listarObrasDeArte()'
	 */
	public static void listarObrasDeArte(Scanner input, GestionMuseo gestion) {
		System.out.println("    ------ Lista obras de arte ------");
		gestion.listarObrasDeArte();
		System.out.println("Pulse enter para salir");
		input.nextLine();
	}

	/**
	 * Lista todos los objetos de tipo Empleado registrados. Con un pequeño título y
	 * teniendo que pulsar enter para salir del listado.
	 * 
	 * @param input   Scanner que permite escribir por consola
	 * @param gestion Objeto de GestionMuseo que llama al metodo 'listarEmpleados()'
	 */
	public static void listarEmpleados(Scanner input, GestionMuseo gestion) {
		System.out.println("    ------ Lista empleados ------");
		gestion.listarEmpleados();
		System.out.println("Pulse enter para salir");
		input.nextLine();
	}

	/**
	 * Lista todos los objetos de tipo Evento registrados. Con un pequeño título y
	 * teniendo que pulsar enter para salir del listado.
	 * 
	 * @param input   Scanner que permite escribir por consola
	 * @param gestion Objeto de GestionMuseo que llama al metodo 'listarEventos()'
	 */
	public static void listarEventos(Scanner input, GestionMuseo gestion) {
		System.out.println("    ------ Lista eventos ------");
		gestion.listarEventos();
		System.out.println("Pulse enter para salir");
		input.nextLine();
	}

	/**
	 * Lista todos los objetos de tipo EventoBenefico registrados. Con un pequeño
	 * título y teniendo que pulsar enter para salir del listado.
	 * 
	 * @param input   Scanner que permite escribir por consola
	 * @param gestion Objeto de GestionMuseo que llama al metodo
	 *                'listarEventosBeneficos()'
	 */
	public static void listarEventosBeneficos(Scanner input, GestionMuseo gestion) {
		System.out.println("    ------ Lista eventos beneficos ------");
		gestion.listarEventosBeneficos();
		System.out.println("Pulse enter para salir");
		input.nextLine();
	}

	/**
	 * Lista todos los objetos de tipo EventoGenerico registrados, llamando al
	 * método propio de EventoGenerico 'descripcionEvento()'. Pide pulsar la tecla
	 * enter para salir del listado.
	 * 
	 * @param input   Scanner que permite escribir por consola
	 * @param gestion Objeto de GestionMuseo que llama al metodo
	 *                'listarEventosGenericos()'
	 */
	public static void listarEventosGenericos(Scanner input, GestionMuseo gestion) {

		System.out.println("    ------ Lista eventos genéricos ------");
		for (EventoGenerico evento : gestion.getListaEventosGenericos()) {
			System.out.println(evento.descripcionEvento());
			System.out.println("-----------------------------------------------");
		}
		System.out.println("Pulse enter para salir");
		input.nextLine();
	}
}
