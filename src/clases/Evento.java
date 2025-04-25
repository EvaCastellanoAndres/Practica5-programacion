package clases;

import java.time.LocalDate;

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
		return "Evento: \nnombre: "+nombre+", organizador: " + organizador + ", fechaInicio: " + fechaInicio + ", fechaFin: " + fechaFin
				+ ", tema: " + tema + ", museo: " + museo;
	}

}
