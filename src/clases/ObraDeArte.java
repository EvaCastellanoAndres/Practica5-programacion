package clases;

public class ObraDeArte {
	private String titulo;
	private int siglo;
	private Artista artista;

	// CONSTRUCTORES
	
	public ObraDeArte() {
		this.titulo = "";
		this.siglo = 0;
		this.artista = null;
	}

	public ObraDeArte(String titulo, int siglo, Artista artista) {
		this.titulo = titulo;
		this.siglo = siglo;
		this.artista = artista;
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

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	// ToSTRING
	
	@Override
	public String toString() {
		return "ObraDeArte: \ntitulo: " + titulo + ", siglo " + siglo + ", artista: " + artista;
	}

}
