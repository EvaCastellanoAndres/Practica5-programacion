package programa;

import java.util.Scanner;

import clases.GestionMuseo;
import gestion.InstanciarClases;
import menu.Menu;
import menu.DarDeAlta;
import menu.Listar;
import menu.Buscar;
import menu.Eliminar;
import menu.ComprobarEstadoEvento;
import menu.ComprobarDuracionEvento;
import menu.AñadirDonacion;
import menu.EstadoDonaciones;

public class Programa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GestionMuseo gestion = new GestionMuseo();
		InstanciarClases.crearMuseos(gestion);
		InstanciarClases.crearCuadros(gestion);
		InstanciarClases.crearEsculturas(gestion);
		InstanciarClases.crearObrasDeArte(gestion);
		InstanciarClases.crearEmpleados(gestion);
		InstanciarClases.crearEventos(gestion);
		InstanciarClases.crearEventosBeneficos(gestion);
		InstanciarClases.crearEventosGenericos(gestion);
		
		String opcion;
		do {
			Menu.menu();
			opcion = input.nextLine();

			switch (opcion) {
			case "1.1": // Alta museo
				DarDeAlta.altaMuseo(input, gestion);
				break;

			case "1.2":// Alta cuadro
				DarDeAlta.altaCuadro(input, gestion);
				break;

			case "1.3":// Alta escultura
				DarDeAlta.altaEscultura(input, gestion);
				break;

			case "1.4":// Alta Obra de Arte
				DarDeAlta.altaObraDeArte(input, gestion);
				break;

			case "1.5":// Alta Empleado
				DarDeAlta.altaEmpleado(input, gestion);
				break;

			case "1.6":// Alta Evento
				DarDeAlta.altaEvento(input, gestion);
				break;

			case "1.7":// Alta Evento benéfico
				DarDeAlta.altaEventoBenefico(input, gestion);
				break;

			case "1.8":// Alta Evento genérico
				DarDeAlta.altaEventoGenerico(input, gestion);
				break;

			case "2.1":// Buscar museo
				Buscar.buscarMuseo(input, gestion);
				break;

			case "2.2":// Buscar cuadro
				Buscar.buscarCuadro(input, gestion);
				break;

			case "2.3":// Buscar escultura
				Buscar.buscarEscultura(input, gestion);
				break;

			case "2.4":// Buscar obraDeArte
				Buscar.buscarObraDeArte(input, gestion);
				break;

			case "2.5":// Buscar Empleado
				Buscar.buscarEmpleado(input, gestion);
				break;

			case "2.6":// Buscar evento
				Buscar.buscarEvento(input, gestion);
				break;

			case "2.7":// Buscar evento benefico
				Buscar.buscarEventoBenefico(input, gestion);
				break;

			case "2.8":// Buscar evento generico
				Buscar.buscarEventoGenerico(input, gestion);
				break;
				
			case "2.9":// Buscar por publico objetivo
				Buscar.publicoObjetivo(input, gestion, gestion.getListaEventosGenericos());
				break;

			case "3.1":// Listar museos
				Listar.listarMuseos(input, gestion);
				break;

			case "3.2":// Listar cuadros
				Listar.listarCuadros(input, gestion);
				break;

			case "3.3":// Listar esculturas
				Listar.listarEsculturas(input, gestion);
				break;

			case "3.4":// Listar obrasDeArte
				Listar.listarObrasDeArte(input, gestion);
				break;

			case "3.5":// Listar empleados
				Listar.listarEmpleados(input, gestion);
				break;

			case "3.6":// Listar eventos
				Listar.listarEventos(input, gestion);
				break;

			case "3.7":// Listar eventos beneficos
				Listar.listarEventosBeneficos(input, gestion);
				break;

			case "3.8":// Listar eventos genericos
				Listar.listarEventosGenericos(input, gestion);
				break;

			case "4.1":// Eliminar museo
				Eliminar.eliminarMuseo(input, gestion);
				break;

			case "4.2":// Eliminar cuadro
				Eliminar.eliminarCuadro(input, gestion);
				break;

			case "4.3":// Eliminar escultura
				Eliminar.eliminarEscultura(input, gestion);
				break;

			case "4.4":// Eliminar obraDeArte
				Eliminar.eliminarObraDeArte(input, gestion);
				break;

			case "4.5":// Eliminar empleado
				Eliminar.eliminarEmpleado(input, gestion);
				break;

			case "4.6":// Eliminar evento
				Eliminar.eliminarEvento(input, gestion);
				break;

			case "5":// Comprobar estado evento
				ComprobarEstadoEvento.comprobarEstado(input, gestion.getListaEventos());
				break;

			case "6":// Comprobar duracion evento
				ComprobarDuracionEvento.comprobarDuracion(input, gestion.getListaEventos());
				break;

			case "7":// Añadir donacion a evento benefico
				AñadirDonacion.añadirDonacion(input, gestion, gestion.getListaEventosBeneficos());
				break;
			case "8":// Ver el estado de las donaciones de un evento benefico
				EstadoDonaciones.mostrarEstado(input, gestion.getListaEventosBeneficos());
				break;
			default:
				System.out.println("- Opción no válida -");
				System.out.println("Pulse enter para seguir");
				input.nextLine();
				break;
			}
		} while (!opcion.equals("9")); // 9 -> salir

		input.close();
	}

}
