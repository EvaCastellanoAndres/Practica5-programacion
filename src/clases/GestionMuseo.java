package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase que sirve para gestionar las acciones esenciales de la aplicacion, como
 * dar de alta, listar, eliminar o comprobar que exista un objeto.
 * 
 * @author Eva Castellano
 *
 */
public class GestionMuseo {
	// ARRAYLISTS
	protected ArrayList<Museo> listaMuseos;
	protected ArrayList<ObraDeArte> listaObrasDeArte;
	protected ArrayList<Cuadro> listaCuadros;
	protected ArrayList<Escultura> listaEsculturas;
	protected ArrayList<Empleado> listaEmpleados;
	protected ArrayList<Evento> listaEventos;
	protected ArrayList<EventoBenefico> listaEventosBeneficos;
	protected ArrayList<EventoGenerico> listaEventosGenericos;

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

	// GETTERS
	public ArrayList<EventoGenerico> getListaEventosGenericos() {
		return listaEventosGenericos;
	}

	public ArrayList<Evento> getListaEventos() {
		return listaEventos;
	}

	public ArrayList<EventoBenefico> getListaEventosBeneficos() {
		return listaEventosBeneficos;
	}

	// ALTA MUSEO
	/**
	 * Método que crea un objeto de tipo museo recibiendo los parámetros necesarios.
	 * 
	 * @param nombre        Nombre del museo
	 * @param aforo         Capacidad del museo
	 * @param precioEntrada Precio a pagar para entrar al museo
	 */
	public void altaMuseo(String nombre, int aforo, double precioEntrada) {
		Museo nuevoMuseo = new Museo(nombre, aforo, precioEntrada);
		listaMuseos.add(nuevoMuseo);
	}

	// LISTAR MUSEOS
	/**
	 * Método que lista todos los museos existentes en la aplicación.
	 */
	public void listarMuseos() {
		for (Museo museo : listaMuseos) {
			System.out.println(museo + "\n");
		}
	}

	// Existe MUSEO
	/**
	 * Método que comprueba si existe o no un museo específico.
	 * 
	 * @param nombre Nombre del museo que se va a comprobar
	 * @return Booleano indicando 'true' para decir que existe y 'false' para decir
	 *         que no existe.
	 */
	public boolean existeMuseo(String nombre) {
		for (Museo museo : listaMuseos) {
			if (museo != null && museo.getNombre().equalsIgnoreCase(nombre)) {
				return true;
			}
		}
		return false;
	}

	// ELIMINAR MUSEO
	/**
	 * Método que elimina un museo concreto.
	 * 
	 * @param nombre Nombre del museo a eliminar
	 */
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
	/**
	 * Método que devuelve el objeto Museo indicado.
	 * 
	 * @param nombre Nombre del museo que se devolverá
	 * @return Objeto Museo
	 */
	public Museo devolverMuseo(String nombre) {
		for (Museo museo : listaMuseos) {
			if (museo != null && museo.getNombre().equalsIgnoreCase(nombre)) {
				return museo;
			}
		}
		return null;
	}

	// ALTA OBRA DE ARTE
	/**
	 * Método que crea un objeto de tipo ObraDeArte recibiendo los parámetros
	 * necesarios.
	 * 
	 * @param titulo El título de la obra de arte
	 * @param siglo  El siglo en el que se creó
	 */
	public void altaObraDeArte(String titulo, int siglo) {
		ObraDeArte nuevaObraDeArte = new ObraDeArte(titulo, siglo);
		listaObrasDeArte.add(nuevaObraDeArte);
	}

	// LISTAR OBRAS DE ARTE
	/**
	 * Método que lista todas las obras de arte registradas en la aplicacion
	 */
	public void listarObrasDeArte() {
		for (ObraDeArte obraArte : listaObrasDeArte) {
			System.out.println(obraArte + "\n");
		}
	}

	// BUSCAR OBRA DE ARTE
	/**
	 * Método que devuelve el objeto ObraDeArte indicado.
	 * 
	 * @param titulo Título de la obra de arte
	 * @return Objeto ObraDeArte específico
	 */
	public ObraDeArte buscarObraDeArte(String titulo) {
		for (ObraDeArte obraArte : listaObrasDeArte) {
			if (obraArte != null && obraArte.getTitulo().equalsIgnoreCase(titulo)) {
				return obraArte;
			}
		}
		return null;
	}

	// ELIMINAR OBRA DE ARTE
	/**
	 * Método que elimina una obra de arte concreta.
	 * 
	 * @param titulo Título de la obra a eliminar
	 */
	public void eliminarObraDeArte(String titulo) {
		Iterator<ObraDeArte> iteradorObraDeArte = listaObrasDeArte.iterator();
		while (iteradorObraDeArte.hasNext()) {
			ObraDeArte obraArte = iteradorObraDeArte.next();
			if (obraArte.getTitulo().equalsIgnoreCase(titulo)) {
				iteradorObraDeArte.remove();
			}
		}
	}

	// EXISTE OBRA DE ARTE
	/**
	 * Método que comprueba si existe una obra de arte.
	 * 
	 * @param titulo Título de la obra a comprobar
	 * @return true si existe, false si no
	 */
	public boolean existeObraDeArte(String titulo) {
		for (ObraDeArte obra : listaObrasDeArte) {
			if (obra.getTitulo().equalsIgnoreCase(titulo)) {
				return true;
			}
		}
		return false;
	}

	// ALTA CUADRO
	/**
	 * Método que da de alta un cuadro con los datos indicados.
	 * 
	 * @param titulo Título del cuadro
	 * @param siglo  Siglo del cuadro
	 * @param estilo Estilo del cuadro
	 */
	public void altaCuadro(String titulo, int siglo, String estilo) {
		Cuadro nuevoCuadro = new Cuadro(titulo, siglo, estilo);
		listaCuadros.add(nuevoCuadro);
	}

	// LISTAR CUADROS
	/**
	 * Método que lista todos los cuadros registrados.
	 */
	public void listarCuadros() {
		for (Cuadro cuadro : listaCuadros) {
			System.out.println(cuadro + "\n");
		}
	}

	// BUSCAR CUADRO
	/**
	 * Método que busca un cuadro concreto por su título.
	 * 
	 * @param titulo Título del cuadro
	 * @return Objeto Cuadro si existe, null si no
	 */
	public Cuadro buscarCuadro(String titulo) {
		for (Cuadro cuadro : listaCuadros) {
			if (cuadro != null && cuadro.getTitulo().equalsIgnoreCase(titulo)) {
				return cuadro;
			}
		}
		return null;
	}

	// ELIMINAR CUADRO
	/**
	 * Método que elimina un cuadro concreto.
	 * 
	 * @param titulo Título del cuadro a eliminar
	 */
	public void eliminarCuadro(String titulo) {
		Iterator<Cuadro> iteradorCuadros = listaCuadros.iterator();
		while (iteradorCuadros.hasNext()) {
			Cuadro cuadro = iteradorCuadros.next();
			if (cuadro.getTitulo().equalsIgnoreCase(titulo)) {
				iteradorCuadros.remove();
			}
		}
	}

	// EXISTE CUADRO
	/**
	 * Método que comprueba si existe un cuadro.
	 * 
	 * @param titulo Título del cuadro
	 * @return true si existe, false si no
	 */
	public boolean existeCuadro(String titulo) {
		for (Cuadro cuadro : listaCuadros) {
			if (cuadro.getTitulo().equalsIgnoreCase(titulo)) {
				return true;
			}
		}
		return false;
	}

	// ALTA ESCULTURA
	/**
	 * Método que da de alta una escultura con los datos indicados.
	 * 
	 * @param titulo   Título de la escultura
	 * @param siglo    Siglo de la escultura
	 * @param material Material de la escultura
	 */
	public void altaEscultura(String titulo, int siglo, String material) {
		Escultura nuevaEscultura = new Escultura(titulo, siglo, material);
		listaEsculturas.add(nuevaEscultura);
	}

	// LISTAR ESCULTURAS
	/**
	 * Método que lista todas las esculturas registradas.
	 */
	public void listarEsculturas() {
		for (Escultura escultura : listaEsculturas) {
			System.out.println(escultura + "\n");
		}
	}

	// BUSCAR ESCULTURA
	/**
	 * Método que busca una escultura concreta por su título.
	 * 
	 * @param titulo Título de la escultura
	 * @return Objeto Escultura si existe, null si no
	 */
	public Escultura buscarEscultura(String titulo) {
		for (Escultura escultura : listaEsculturas) {
			if (escultura != null && escultura.getTitulo().equalsIgnoreCase(titulo)) {
				return escultura;
			}
		}
		return null;
	}

	// ELIMINAR ESCULTURA
	/**
	 * Método que elimina una escultura concreta.
	 * 
	 * @param titulo Título de la escultura a eliminar
	 */
	public void eliminarEscultura(String titulo) {
		Iterator<Escultura> iteradorEsculturas = listaEsculturas.iterator();
		while (iteradorEsculturas.hasNext()) {
			Escultura escultura = iteradorEsculturas.next();
			if (escultura.getTitulo().equalsIgnoreCase(titulo)) {
				iteradorEsculturas.remove();
			}
		}
	}

	// EXISTE ESCULTURA
	/**
	 * Método que comprueba si existe una escultura.
	 * 
	 * @param titulo Título de la escultura
	 * @return true si existe, false si no
	 */
	public boolean existeEscultura(String titulo) {
		for (Escultura escultura : listaEsculturas) {
			if (escultura.getTitulo().equalsIgnoreCase(titulo)) {
				return true;
			}
		}
		return false;
	}

	// ALTA EMPLEADO
	/**
	 * Método que da de alta un empleado en un museo concreto.
	 * 
	 * @param nombre    Nombre del empleado
	 * @param apellidos Apellidos del empleado
	 * @param dni       DNI del empleado
	 * @param sueldo    Sueldo del empleado
	 * @param museo     Museo donde trabaja
	 */
	public void altaEmpleado(String nombre, String apellidos, String dni, double sueldo, String museo) {
		Empleado nuevoEmpleado = new Empleado(nombre, apellidos, dni, sueldo, devolverMuseo(museo));
		listaEmpleados.add(nuevoEmpleado);
	}

	// LISTAR EMPLEADOS
	/**
	 * Método que lista todos los empleados registrados.
	 */
	public void listarEmpleados() {
		for (Empleado empleado : listaEmpleados) {
			System.out.println(empleado + "\n");
		}
	}

	// BUSCAR EMPLEADO
	/**
	 * Método que busca un empleado por su DNI.
	 * 
	 * @param dni DNI del empleado
	 * @return Objeto Empleado si existe, null si no
	 */
	public Empleado buscarEmpleado(String dni) {
		for (Empleado empleado : listaEmpleados) {
			if (empleado != null && empleado.getDni().equalsIgnoreCase(dni)) {
				return empleado;
			}
		}
		return null;
	}

	// ELIMINAR EMPLEADO
	/**
	 * Método que elimina un empleado concreto.
	 * 
	 * @param dni DNI del empleado a eliminar
	 */
	public void eliminarEmpleado(String dni) {
		Iterator<Empleado> iteradorEmpleados = listaEmpleados.iterator();
		while (iteradorEmpleados.hasNext()) {
			Empleado empleado = iteradorEmpleados.next();
			if (empleado.getDni().equalsIgnoreCase(dni)) {
				iteradorEmpleados.remove();
			}
		}
	}

	// EXISTE EMPLEADO
	/**
	 * Método que comprueba si existe un empleado.
	 * 
	 * @param DNI DNI del empleado
	 * @return true si existe, false si no
	 */
	public boolean existeEmpleado(String DNI) {
		for (Empleado empleado : listaEmpleados) {
			if (empleado.getDni().equalsIgnoreCase(DNI)) {
				return true;
			}
		}
		return false;
	}

	// ALTA EVENTO
	/**
	 * Método que da de alta un evento.
	 * 
	 * @param nombre      Nombre del evento
	 * @param organizador DNI del organizador
	 * @param fechaInicio Fecha de inicio
	 * @param fechaFin    Fecha de fin
	 * @param tema        Tema del evento
	 * @param museo       Museo donde se realiza
	 */
	public void altaEvento(String nombre, String organizador, String fechaInicio, String fechaFin, String tema,
			String museo) {
		LocalDate fechaInicioLD = LocalDate.parse(fechaInicio);
		LocalDate fechaFinLD = LocalDate.parse(fechaFin);
		listaEventos.add(
				new Evento(nombre, buscarEmpleado(organizador), fechaInicioLD, fechaFinLD, tema, devolverMuseo(museo)));
	}

	// LISTAR EVENTOS
	/**
	 * Método que lista todos los eventos registrados.
	 */
	public void listarEventos() {
		for (Evento evento : listaEventos) {
			System.out.println(evento + "\n");
		}
	}

	// BUSCAR EVENTO
	/**
	 * Método que busca un evento por su nombre.
	 * 
	 * @param nombre Nombre del evento
	 * @return Objeto Evento si existe, null si no
	 */
	public Evento buscarEvento(String nombre) {
		for (Evento evento : listaEventos) {
			if (evento != null && evento.getNombre().equalsIgnoreCase(nombre)) {
				return evento;
			}
		}
		return null;
	}

	// ELIMINAR EVENTO
	/**
	 * Método que elimina un evento concreto.
	 * 
	 * @param nombre Nombre del evento a eliminar
	 */
	public void eliminarEvento(String nombre) {
		Iterator<Evento> iteradorEventos = listaEventos.iterator();
		while (iteradorEventos.hasNext()) {
			Evento evento = iteradorEventos.next();
			if (evento.getNombre().equalsIgnoreCase(nombre)) {
				iteradorEventos.remove();
			}
		}
	}

	// EXISTE EVENTO
	/**
	 * Método que comprueba si existe un evento.
	 * 
	 * @param nombre Nombre del evento
	 * @return true si existe, false si no
	 */
	public boolean existeEvento(String nombre) {
		for (Evento evento : listaEventos) {
			if (evento.getNombre().equalsIgnoreCase(nombre)) {
				return true;
			}
		}
		return false;
	}

	// ALTA EVENTO BENEFICO
	/**
	 * Método que da de alta un evento benéfico, tanto en su propio ArrayList de
	 * EventoBenefico como en el general de Evento.
	 * 
	 * @param nombre          Nombre del evento
	 * @param organizador     DNI del organizador
	 * @param fechaInicio     Fecha de inicio
	 * @param fechaFin        Fecha de fin
	 * @param tema            Tema del evento
	 * @param museo           Museo donde se realiza
	 * @param causa           Causa benéfica
	 * @param metaRecaudacion Meta de dinero a recaudar
	 * @param totalRecaudado  Dinero ya recaudado
	 */
	public void altaEventoBenefico(String nombre, String organizador, String fechaInicio, String fechaFin, String tema,
			String museo, String causa, double metaRecaudacion, double totalRecaudado) {
		LocalDate fechaInicioLD = LocalDate.parse(fechaInicio);
		LocalDate fechaFinLD = LocalDate.parse(fechaFin);

		listaEventosBeneficos.add(new EventoBenefico(nombre, buscarEmpleado(organizador), fechaInicioLD, fechaFinLD,
				tema, devolverMuseo(museo), causa, metaRecaudacion, totalRecaudado));
		listaEventos.add(
				new Evento(nombre, buscarEmpleado(organizador), fechaInicioLD, fechaFinLD, tema, devolverMuseo(museo)));
	}

	// LISTAR EVENTOS BENEFICOS
	/**
	 * Método que lista todos los eventos benéficos registrados.
	 */
	public void listarEventosBeneficos() {
		for (EventoBenefico eventoBenefico : listaEventosBeneficos) {
			System.out.println(eventoBenefico + "\n");
		}
	}

	// BUSCAR EVENTO BENEFICO
	/**
	 * Método que busca un evento benéfico por su nombre.
	 * 
	 * @param nombre Nombre del evento
	 * @return Objeto EventoBenefico si existe, null si no
	 */
	public EventoBenefico buscarEventoBenefico(String nombre) {
		for (EventoBenefico evento : listaEventosBeneficos) {
			if (evento != null && evento.getNombre().equalsIgnoreCase(nombre)) {
				return evento;
			}
		}
		return null;
	}

	// ELIMINAR EVENTO BENEFICO
	/**
	 * Método que elimina un evento benéfico concreto.
	 * 
	 * @param nombre Nombre del evento a eliminar
	 */
	public void eliminarEventoBenefico(String nombre) {
		Iterator<EventoBenefico> iteradorEventosBeneficos = listaEventosBeneficos.iterator();
		while (iteradorEventosBeneficos.hasNext()) {
			EventoBenefico eventoBenefico = iteradorEventosBeneficos.next();
			if (eventoBenefico.getNombre().equalsIgnoreCase(nombre)) {
				iteradorEventosBeneficos.remove();
			}
		}
	}

	// EXISTE EVENTO BENEFICO
	/**
	 * Método que comprueba si existe un evento benéfico.
	 * 
	 * @param nombre Nombre del evento
	 * @return true si existe, false si no
	 */
	public boolean existeEventoBenefico(String nombre) {
		for (EventoBenefico evento : listaEventosBeneficos) {
			if (evento.getNombre().equalsIgnoreCase(nombre)) {
				return true;
			}
		}
		return false;
	}

	// ALTA EVENTO GENERICO
	/**
	 * Método que da de alta un evento genérico, tanto en su propio ArrayList de
	 * EventoGenerico como en el general de Evento.
	 * 
	 * @param nombre              Nombre del evento
	 * @param organizador         DNI del organizador
	 * @param fechaInicio         Fecha de inicio
	 * @param fechaFin            Fecha de fin
	 * @param tema                Tema del evento
	 * @param museo               Museo donde se realiza
	 * @param tipo                Tipo de evento
	 * @param publicoObjetivo     Público al que va dirigido
	 * @param requiereInscripcion Indica si necesita inscripción
	 */
	public void altaEventoGenerico(String nombre, String organizador, String fechaInicio, String fechaFin, String tema,
			String museo, String tipo, String publicoObjetivo, boolean requiereInscripcion) {
		LocalDate fechaInicioLD = LocalDate.parse(fechaInicio);
		LocalDate fechaFinLD = LocalDate.parse(fechaFin);

		listaEventosGenericos.add(new EventoGenerico(nombre, buscarEmpleado(organizador), fechaInicioLD, fechaFinLD,
				tema, devolverMuseo(museo), tipo, publicoObjetivo, requiereInscripcion));
		listaEventos.add(
				new Evento(nombre, buscarEmpleado(organizador), fechaInicioLD, fechaFinLD, tema, devolverMuseo(museo)));
	}

	// LISTAR EVENTOS GENERICOS
	/**
	 * Método que lista todos los eventos genéricos registrados.
	 */
	public void listarEventosGenericos() {
		for (EventoGenerico eventoGenerico : listaEventosGenericos) {
			System.out.println(eventoGenerico + "\n");
		}
	}

	// BUSCAR EVENTO GENERICO
	/**
	 * Método que busca un evento genérico por su nombre.
	 * 
	 * @param nombre Nombre del evento
	 * @return Objeto EventoGenerico si existe, null si no
	 */
	public EventoGenerico buscarEventoGenerico(String nombre) {
		for (EventoGenerico eventoGenerico : listaEventosGenericos) {
			if (eventoGenerico != null && eventoGenerico.getNombre().equalsIgnoreCase(nombre)) {
				return eventoGenerico;
			}
		}
		return null;
	}

	// ELIMINAR EVENTO GENERICO
	/**
	 * Método que elimina un evento genérico concreto.
	 * 
	 * @param nombre Nombre del evento a eliminar
	 */
	public void eliminarEventoGenerico(String nombre) {
		Iterator<EventoGenerico> iteradorEventosGenericos = listaEventosGenericos.iterator();
		while (iteradorEventosGenericos.hasNext()) {
			EventoGenerico eventoGenerico = iteradorEventosGenericos.next();
			if (eventoGenerico.getNombre().equalsIgnoreCase(nombre)) {
				iteradorEventosGenericos.remove();
			}
		}
	}

	// EXISTE EVENTO BENEFICO
	/**
	 * Método que comprueba si existe un evento genérico.
	 * 
	 * @param nombre Nombre del evento
	 * @return true si existe, false si no
	 */
	public boolean existeEventoGenerico(String nombre) {
		for (EventoGenerico evento : listaEventosGenericos) {
			if (evento.getNombre().equalsIgnoreCase(nombre)) {
				return true;
			}
		}
		return false;
	}
}
