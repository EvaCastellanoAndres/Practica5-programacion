package clases;

public class Empleado {
	private String nombre;
	private String apellidos;
	private String dni;
	private double sueldo;
	private Museo museo;

	// CONSTRUCTORES

	public Empleado() {
		this.nombre = "";
		this.apellidos = "";
		this.dni = "";
		this.sueldo = 0.0;
		this.museo = null;
	}

	public Empleado(String nombre, String apellidos, String dni, double sueldo, Museo museo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.sueldo = sueldo;
		this.museo = museo;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
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
		return "Empleado: \nnombre: " + nombre + ", apellidos: " + apellidos + ", dni: " + dni + ", sueldo: " + sueldo
				+ ", museo: " + museo;
	}

}
