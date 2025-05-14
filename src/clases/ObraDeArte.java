package clases;

public class ObraDeArte {
	private String titulo;
	private int siglo;
	
	// CONSTRUCTORES
	
	public ObraDeArte() {
		this.titulo = "";
		this.siglo = 0;
	}

	public ObraDeArte(String titulo, int siglo) {
		this.titulo = titulo;
		this.siglo = siglo;
	}

	// GETTERS Y SETTERS
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getSiglo() {
		return siglo;
	}

	public void setSiglo(int siglo) {
		this.siglo = siglo;
	}

	// ToSTRING
	
	@Override
	public String toString() {
		return "Obra de arte: \nTítulo: " + titulo + ", siglo " + siglo;
	}

}
