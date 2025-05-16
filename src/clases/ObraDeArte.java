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
		if(siglo<0) {
			siglo=siglo*-2+siglo;
			return "Título: " + titulo + "\nSiglo " + siglo+" a.C";
		}else {
			return "Título: " + titulo + "\nSiglo " + siglo;
		}
		
	}

}
