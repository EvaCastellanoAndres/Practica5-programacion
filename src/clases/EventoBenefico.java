package clases;

import java.time.LocalDate;

public class EventoBenefico extends Evento {
	private String causa;
	private double metaRecaudacion;
	private double totalRecaudado;

	// CONSTRUCTORES

	public EventoBenefico() {
		super();
		this.causa = "";
		this.metaRecaudacion = 0.0;
		this.totalRecaudado = 0.0;
	}

	public EventoBenefico(String nombre, Empleado organizador, LocalDate fechaInicio, LocalDate fechaFin, String tema,
			Museo museo, String causa, double metaRecaudacion, double totalRecaudado) {
		super(nombre, organizador, fechaInicio, fechaFin, tema, museo);
		this.causa = causa;
		this.metaRecaudacion = metaRecaudacion;
		this.totalRecaudado = totalRecaudado;
	}

	// GETTERS Y SETTERS

	public String getCausa() {
		return causa;
	}

	public void setCausa(String causa) {
		this.causa = causa;
	}

	public double getMetaRecaudacion() {
		return metaRecaudacion;
	}

	public void setMetaRecaudacion(double metaRecaudacion) {
		this.metaRecaudacion = metaRecaudacion;
	}

	public double getTotalRecaudado() {
		return totalRecaudado;
	}

	public void setTotalRecaudado(double totalRecaudado) {
		this.totalRecaudado = totalRecaudado;
	}

	// ToSTRING

	@Override
	public String toString() {
		return "EventoBenefico: \ncausa: " + causa + ", metaRecaudacion: " + metaRecaudacion + ", totalRecaudado: "
				+ totalRecaudado + "\n" + super.toString();
	}

	// METODOS PROPIOS
	
	public void añadirDonacion(double cantidad) {
		this.totalRecaudado += cantidad;
	}

	public boolean metaAlcanzada() {
		if (this.totalRecaudado >= this.metaRecaudacion) {
			return true;
		} else {
			return false;
		}
	}

}
