package clases;

import java.time.LocalDate;

public class Artista {
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private LocalDate fechaFallecimiento;
	private String nacionalidad;

	// CONSTRUCTORES
	
	public Artista() {
		this.nombre = "";
		this.apellidos = "";
		this.fechaNacimiento = null;
		this.fechaFallecimiento = null;
		this.nacionalidad = "";
	}
	
	public Artista(String nombre, String apellidos, LocalDate fechaNacimiento, LocalDate fechaFallecimiento, String nacionalidad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaFallecimiento = fechaFallecimiento;
		this.nacionalidad = nacionalidad;
	}

	// GETTERS Y SETTERS
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public LocalDate getFechaFallecimiento() {
		return fechaFallecimiento;
	}

	public void setFechaFallecimiento(LocalDate fechaFallecimiento) {
		this.fechaFallecimiento = fechaFallecimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	// ToSTRING
	
	@Override
	public String toString() {
		return "Artista: \nNombre: " + nombre + ", apellidos: " + apellidos + ", nacionalidad: " + nacionalidad + "\nfecha nacimiento: " + fechaNacimiento
				+ "\nfecha fallecimiento: " + fechaFallecimiento ;
	}
	
	
}
