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

	public EventoGenerico(String nombre, Empleado organizador, LocalDate fechaInicio, LocalDate fechaFin, String tema,
			Museo museo, String tipo, String publicoObjetivo, boolean requiereInscripcion) {
		super(nombre, organizador, fechaInicio, fechaFin, tema, museo);
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

	/**
	 * Indica si el evento es adecuado para un determinado público.
	 * 
	 * @param tipoPublico El tipo de público a comprobar
	 * @return true si el público coincide con el objetivo del evento, false si no
	 *         coincida
	 */
	public boolean esAdecuadoPara(String tipoPublico) {
		return this.publicoObjetivo.equalsIgnoreCase(tipoPublico);
	}

	// ToSTRING

	@Override
	public String toString() {
		String inscripcion;
		if (requiereInscripcion) {
			inscripcion = "- Requiere inscripción";
		} else {
			inscripcion = "- No requiere inscripción";
		}
		return super.toString() + "\nTipo: " + tipo + "\nPublico objetivo: " + publicoObjetivo + "\n" + inscripcion;
	}

}
