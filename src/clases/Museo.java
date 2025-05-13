package clases;

public class Museo {
	private String nombre;
	private int aforo;
	private double precioEntrada;

	// CONSTRUCTORES

	public Museo() {
		this.nombre = "";
		this.aforo = 0;
		this.precioEntrada = 0.0;
	}

	public Museo(String nombre, int aforo, double precioEntrada) {
		this.nombre = nombre;
		this.aforo = aforo;
		this.precioEntrada = precioEntrada;
	}

	// GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	// ToSTRING
	
	@Override
	public String toString() {
		return "MUSEO " + nombre + ": \naforo: " + aforo + ", precioEntrada:" + precioEntrada;
	}
	
	
	

}
