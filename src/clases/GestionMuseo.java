package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class GestionMuseo {
	// ARRAYLISTS
	private ArrayList<Museo> listaMuseos;
	private ArrayList<ObraDeArte> listaObrasDeArte;
	private ArrayList<Cuadro> listaCuadros;
	private ArrayList<Escultura> listaEsculturas;
	private ArrayList<Empleado> listaEmpleados;
	private ArrayList<Evento> listaEventos;
	private ArrayList<EventoBenefico> listaEventosBeneficos;
	private ArrayList<EventoGenerico> listaEventosGenericos;

	// CONSTRUCTOR
	public GestionMuseo() {
		listaMuseos = new ArrayList<Museo>();
		listaObrasDeArte = new ArrayList<ObraDeArte>();
		listaCuadros = new ArrayList<Cuadro>();
		listaEsculturas = new ArrayList<Escultura>();
		listaEmpleados = new ArrayList<Empleado>();
		listaEventos = new ArrayList<Evento>();
		listaEventosBeneficos = new ArrayList<EventoBenefico>();
		listaEventosGenericos = new ArrayList<EventoGenerico>();
	}

	// ALTA MUSEO
	public void altaMuseo(String nombre, int aforo, double precioEntrada) {
		Museo nuevoMuseo = new Museo(nombre, aforo, precioEntrada);
		listaMuseos.add(nuevoMuseo);
	}

	// LISTAR MUSEOS
	public void listarMuseos() {
		for (Museo museo : listaMuseos) {
			System.out.println(museo + "\n");
		}
	}

	// BUSCAR MUSEO
	public Museo buscarMuseo(String nombre) {
		for (Museo museo : listaMuseos) {
			if (museo != null && museo.getNombre().equalsIgnoreCase(nombre)) {
				return museo;
			}
		}
		return null;
	}

	// ELIMINAR MUSEO
	public void eliminarMuseo(String nombre) {
		Iterator<Museo> iteradorMuseos = listaMuseos.iterator();
		while (iteradorMuseos.hasNext()) {
			Museo museo = iteradorMuseos.next();
			if (museo.getNombre().equalsIgnoreCase(nombre)) {
				iteradorMuseos.remove();
			}
		}
	}

	// DEVOLVER MUSEO
	public Museo devolverMuseo(String nombre) {
		for (Museo museo : listaMuseos) {
			if (museo.getNombre().equalsIgnoreCase(nombre)) {
				return museo;
			}
		}
		return null;
	}

	// ALTA OBRA DE ARTE
	public void altaObraDeArte(String titulo, int siglo) {
		ObraDeArte nuevaObraDeArte = new ObraDeArte(titulo, siglo);
		listaObrasDeArte.add(nuevaObraDeArte);
	}

	// LISTAR OBRAS DE ARTE
	public void listarObrasDeArte() {
		for (ObraDeArte obraArte : listaObrasDeArte) {
			System.out.println(obraArte + "\n");
		}
	}

	// BUSCAR OBRA DE ARTE
	public ObraDeArte buscarObraDeArte(String titulo) {
		for (ObraDeArte obraArte : listaObrasDeArte) {
			if (obraArte != null && obraArte.getTitulo().equalsIgnoreCase(titulo)) {
				return obraArte;
			}
		}
		return null;
	}

	// ELIMINAR OBRA DE ARTE
	public void eliminarObraDeArte(String titulo) {
		Iterator<ObraDeArte> iteradorObraDeArte = listaObrasDeArte.iterator();
		while (iteradorObraDeArte.hasNext()) {
			ObraDeArte obraArte = iteradorObraDeArte.next();
			if (obraArte.getTitulo().equalsIgnoreCase(titulo)) {
				iteradorObraDeArte.remove();
			}
		}
	}

	// ALTA CUADRO
	public void altaCuadro(String titulo, int siglo, String estilo) {
		Cuadro nuevoCuadro = new Cuadro(titulo, siglo, estilo);
		listaCuadros.add(nuevoCuadro);
	}

	// LISTAR CUADROS
	public void listarCuadros() {
		for (Cuadro cuadro : listaCuadros) {
			System.out.println(cuadro + "\n");
		}
	}

	// BUSCAR CUADRO
	public Cuadro buscarCuadro(String titulo) {
		for (Cuadro cuadro : listaCuadros) {
			if (cuadro != null && cuadro.getTitulo().equalsIgnoreCase(titulo)) {
				return cuadro;
			}
		}
		return null;
	}

	// ELIMINAR CUADRO
	public void eliminarCuadro(String titulo) {
		Iterator<Cuadro> iteradorCuadros = listaCuadros.iterator();
		while (iteradorCuadros.hasNext()) {
			Cuadro cuadro = iteradorCuadros.next();
			if (cuadro.getTitulo().equalsIgnoreCase(titulo)) {
				iteradorCuadros.remove();
			}
		}
	}

	// ALTA ESCULTURA
	public void altaEscultura(String titulo, int siglo, String material) {
		Escultura nuevaEscultura = new Escultura(titulo, siglo, material);
		listaEsculturas.add(nuevaEscultura);
	}

	// LISTAR ESCULTURAS
	public void listarEsculturas() {
		for (Escultura escultura : listaEsculturas) {
			System.out.println(escultura + "\n");
		}
	}

	// BUSCAR ESCULTURA
	public Escultura buscarEscultura(String titulo) {
		for (Escultura escultura : listaEsculturas) {
			if (escultura != null && escultura.getTitulo().equalsIgnoreCase(titulo)) {
				return escultura;
			}
		}
		return null;
	}

	// ELIMINAR ESCULTURA
	public void eliminarEscultura(String titulo) {
		Iterator<Escultura> iteradorEsculturas = listaEsculturas.iterator();
		while (iteradorEsculturas.hasNext()) {
			Escultura escultura = iteradorEsculturas.next();
			if (escultura.getTitulo().equalsIgnoreCase(titulo)) {
				iteradorEsculturas.remove();
			}
		}
	}

	// ALTA EMPLEADO
	public void altaEmpleado(String nombre, String apellidos, String dni, double sueldo, String museo) {
		Empleado nuevoEmpleado = new Empleado(nombre, apellidos, dni, sueldo, devolverMuseo(museo));
		listaEmpleados.add(nuevoEmpleado);
	}

	// LISTAR EMPLEADOS
	public void listarEmpleados() {
		for (Empleado empleado : listaEmpleados) {
			System.out.println(empleado + "\n");
		}
	}

	// BUSCAR EMPLEADO
	public Empleado buscarEmpleado(String dni) {
		for (Empleado empleado : listaEmpleados) {
			if (empleado != null && empleado.getDni().equalsIgnoreCase(dni)) {
				return empleado;
			}
		}
		return null;
	}

	// ELIMINAR EMPLEADO
	public void eliminarEmpleado(String dni) {
		Iterator<Empleado> iteradorEmpleados = listaEmpleados.iterator();
		while (iteradorEmpleados.hasNext()) {
			Empleado empleado = iteradorEmpleados.next();
			if (empleado.getDni().equalsIgnoreCase(dni)) {
				iteradorEmpleados.remove();
			}
		}
	}

	// DEVOLVER EMPLEADO
	public Empleado devolverEmpleado(String DNI) {
		for (Empleado empleado : listaEmpleados) {
			if (empleado.getDni().equalsIgnoreCase(DNI)) {
				return empleado;
			}
		}
		return null;
	}

	// ALTA EVENTO
	public void altaEvento(String nombre, Empleado organizador, String fechaInicio, String fechaFin, String tema,
			Museo museo) {
		LocalDate fechaInicioLD = LocalDate.parse(fechaInicio);
		LocalDate fechaFinLD = LocalDate.parse(fechaFin);
		listaEventos.add(new Evento(nombre, organizador, fechaInicioLD, fechaFinLD, tema, museo));
	}

	// LISTAR EVENTOS
	public void listarEventos() {
		for (Evento evento : listaEventos) {
			System.out.println(evento + "\n");
		}
	}

	// BUSCAR EVENTO
	public Evento buscarEvento(String nombre) {
		for (Evento evento : listaEventos) {
			if (evento != null && evento.getNombre().equalsIgnoreCase(nombre)) {
				return evento;
			}
		}
		return null;
	}

	// ELIMINAR EVENTO
	public void eliminarEvento(String nombre) {
		Iterator<Evento> iteradorEventos = listaEventos.iterator();
		while (iteradorEventos.hasNext()) {
			Evento evento = iteradorEventos.next();
			if (evento.getNombre().equalsIgnoreCase(nombre)) {
				iteradorEventos.remove();
			}
		}
	}

	// ALTA EVENTO BENEFICO
	public void altaEventoBenefico(String nombre, String organizador, String fechaInicio, String fechaFin, String tema,
			String museo, String causa, double metaRecaudacion, double totalRecaudado) {
		LocalDate fechaInicioLD = LocalDate.parse(fechaInicio);
		LocalDate fechaFinLD = LocalDate.parse(fechaFin);

		listaEventosBeneficos.add(new EventoBenefico(nombre, devolverEmpleado(organizador), fechaInicioLD, fechaFinLD,
				tema, devolverMuseo(museo), causa, metaRecaudacion, totalRecaudado));
	}

	// LISTAR EVENTOS BENEFICOS
	public void listarEventosBeneficos() {
		for (EventoBenefico eventoBenefico : listaEventosBeneficos) {
			System.out.println(eventoBenefico + "\n");
		}
	}

	// BUSCAR EVENTO BENEFICO
	public EventoBenefico buscarEventoBenefico(String nombre) {
		for (EventoBenefico evento : listaEventosBeneficos) {
			if (evento != null && evento.getNombre().equalsIgnoreCase(nombre)) {
				return evento;
			}
		}
		return null;
	}

	// ELIMINAR EVENTO BENEFICO
	public void eliminarEventoBenefico(String nombre) {
		Iterator<EventoBenefico> iteradorEventosBeneficos = listaEventosBeneficos.iterator();
		while (iteradorEventosBeneficos.hasNext()) {
			EventoBenefico eventoBenefico = iteradorEventosBeneficos.next();
			if (eventoBenefico.getNombre().equalsIgnoreCase(nombre)) {
				iteradorEventosBeneficos.remove();
			}
		}
	}

	// ALTA EVENTO GENERICO
	public void altaEventoGenerico(String nombre, String organizador, String fechaInicio, String fechaFin, String tema,
			String museo, String tipo, String publicoObjetivo, boolean requiereInscripcion) {
		LocalDate fechaInicioLD = LocalDate.parse(fechaInicio);
		LocalDate fechaFinLD = LocalDate.parse(fechaFin);
		listaEventosGenericos.add(new EventoGenerico(nombre, devolverEmpleado(organizador), fechaInicioLD, fechaFinLD,
				tema, devolverMuseo(museo), tipo, publicoObjetivo, requiereInscripcion));
	}

	// LISTAR EVENTOS GENERICOS
	public void listarEventosGenericos() {
		for (EventoGenerico eventoGenerico : listaEventosGenericos) {
			System.out.println(eventoGenerico + "\n");
		}
	}

	// BUSCAR EVENTO GENERICO
	public EventoGenerico buscarEventoGenerico(String nombre) {
		for (EventoGenerico eventoGenerico : listaEventosGenericos) {
			if (eventoGenerico != null && eventoGenerico.getNombre().equalsIgnoreCase(nombre)) {
				return eventoGenerico;
			}
		}
		return null;
	}

	// ELIMINAR EVENTO GENERICO
	public void eliminarEventoGenerico(String nombre) {
		Iterator<EventoGenerico> iteradorEventosGenericos = listaEventosGenericos.iterator();
		while (iteradorEventosGenericos.hasNext()) {
			EventoGenerico eventoGenerico = iteradorEventosGenericos.next();
			if (eventoGenerico.getNombre().equalsIgnoreCase(nombre)) {
				iteradorEventosGenericos.remove();
			}
		}
	}
}
