package clases;

import java.time.LocalDate;

public class Evento {
	private Personal organizador;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String tema;
	
	// CONSTRUCTORES
	
	public Evento() {
		this.organizador = null;
		this.fechaInicio = null;
		this.fechaFin = null;
		this.tema = "";
	}

	public Evento(Personal organizador, LocalDate fechaInicio, LocalDate fechaFin, String tema) {
		this.organizador = organizador;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.tema = tema;
	}
	
	// GETTERS Y SETTERS

	public Personal getOrganizador() {
		return organizador;
	}

	public void setOrganizador(Personal organizador) {
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
	
	// ToSTRING

	@Override
	public String toString() {
		return "Evento: \norganizador: " + organizador + ", fechaInicio: " + fechaInicio + ", fechaFin: " + fechaFin
				+ ", tema: " + tema;
	}

}
