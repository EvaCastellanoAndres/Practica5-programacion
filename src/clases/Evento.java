package clases;

import java.time.LocalDate;
import java.time.Period;

public class Evento {
	private String nombre;
	private Empleado organizador;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String tema;
	private Museo museo;

	// CONSTRUCTORES

	public Evento() {
		this.nombre = "";
		this.organizador = null;
		this.fechaInicio = null;
		this.fechaFin = null;
		this.tema = "";
		this.museo = null;
	}

	public Evento(String nombre, Empleado organizador, LocalDate fechaInicio, LocalDate fechaFin, String tema,
			Museo museo) {
		this.nombre = nombre;
		this.organizador = organizador;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.tema = tema;
		this.museo = museo;
	}

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Empleado getOrganizador() {
		return organizador;
	}

	public void setOrganizador(Empleado organizador) {
		this.organizador = organizador;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public Museo getMuseo() {
		return museo;
	}

	public void setMuseo(Museo museo) {
		this.museo = museo;
	}

	// ToSTRING

	@Override
	public String toString() {
		return "Evento: \nnombre: " + nombre + ", organizador: " + organizador + ", fechaInicio: " + fechaInicio
				+ ", fechaFin: " + fechaFin + ", tema: " + tema + ", museo: " + museo;
	}

	// METODOS PROPIOS
	/**
	 * Este método muestra el estado actual del evento: dependiendo de si aún no ha
	 * comenzado, si ya ha terminado o si está en curso. Indica cuántos días faltan
	 * para que empiece o han pasado desde que terminó.
	 */
	public void estadoEvento() {
		LocalDate hoy = LocalDate.now();

		if (fechaInicio.isAfter(hoy)) {
			Period diferencia = Period.between(hoy, fechaInicio);
			System.out.println("El evento '" + nombre + "' comienza dentro de " + diferencia.getDays() + " días.");
		} else if (fechaFin.isBefore(hoy)) {
			Period diferencia = Period.between(fechaFin, hoy);
			System.out.println("El evento '" + nombre + "' terminó hace " + diferencia.getDays() + " días.");
		} else {
			Period desdeInicio = Period.between(fechaInicio, hoy);
			Period hastaFin = Period.between(hoy, fechaFin);
			System.out.println("El evento '" + nombre + "' comenzó hace " + desdeInicio.getDays()
					+ " días y terminará en " + hastaFin.getDays() + " días.");
		}
	}

	/**
	 * Este método calcula la duración total del evento en días.
	 * 
	 * @return Duración del evento en días
	 */
	public int duracionEvento() {
		Period duracion = Period.between(fechaInicio, fechaFin);
		return duracion.getDays() + 1;
	}

}
