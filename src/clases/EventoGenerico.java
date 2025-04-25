package clases;

import java.time.LocalDate;

public class EventoGenerico extends Evento {
	private String tipo;
	private String publicoObjetivo;
	private boolean requiereInscripcion;
	
	// CONSTRUCTORES

	public EventoGenerico() {
		super();
		this.tipo = "";
		this.publicoObjetivo = "";
		this.requiereInscripcion = false;
	}

	public EventoGenerico(Personal organizador, LocalDate fechaInicio, LocalDate fechaFin, String tema, String tipo,
			String publicoObjetivo, boolean requiereInscripcion) {
		super(organizador, fechaInicio, fechaFin, tema);
		this.tipo = tipo;
		this.publicoObjetivo = publicoObjetivo;
		this.requiereInscripcion = requiereInscripcion;
	}

	// GETTERS Y SETTERS
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPublicoObjetivo() {
		return publicoObjetivo;
	}

	public void setPublicoObjetivo(String publicoObjetivo) {
		this.publicoObjetivo = publicoObjetivo;
	}

	public boolean isRequiereInscripcion() {
		return requiereInscripcion;
	}

	public void setRequiereInscripcion(boolean requiereInscripcion) {
		this.requiereInscripcion = requiereInscripcion;
	}

	// ToSTRING
	
	@Override
	public String toString() {
		return "EventoGenerico: \ntipo: " + tipo + ", publicoObjetivo: " + publicoObjetivo + ", requiereInscripcion: "
				+ requiereInscripcion + "\n" + super.toString();
	}

}
