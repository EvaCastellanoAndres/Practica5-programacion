package clases;

public class Personal {
	private String nombre;
	private String apellidos;
	private String dni;
	private double sueldo;

	// CONSTRUCTORES
	
	public Personal() {
		this.nombre = "";
		this.apellidos = "";
		this.dni = "";
		this.sueldo = 0.0;
	}

	public Personal(String nombre, String apellidos, String dni, double sueldo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.sueldo = sueldo;
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
	
	// ToSTRING
	
	@Override
	public String toString() {
		return "Personal: \nnombre: " + nombre + ", apellidos: " + apellidos + ", dni: " + dni + ", sueldo: " + sueldo;
	}

}
