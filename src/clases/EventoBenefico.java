package clases;

import java.time.LocalDate;

public class EventoBenefico extends Evento {
	private String causa;
	private double totalRecaudado;

	// CONSTRUCTORES

	public EventoBenefico() {
		super();
		this.causa = "";
		this.totalRecaudado = 0.0;
	}

	public EventoBenefico(Personal organizador, LocalDate fechaInicio, LocalDate fechaFin, String tema, String causa,
			double totalRecaudado) {
		super(organizador, fechaInicio, fechaFin, tema);
		this.causa = causa;
		this.totalRecaudado = totalRecaudado;
	}

	// GETTERS Y SETTERS

	public String getCausa() {
		return causa;
	}

	public void setCausa(String causa) {
		this.causa = causa;
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
		return "EventoBenefico: \ncausa: " + causa + ", totalRecaudado: " + totalRecaudado + "\n" + super.toString();
	}

}
