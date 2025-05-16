package clases;

public class Cuadro extends ObraDeArte {
	private String estilo;

	// CONSTRUCTORES

	public Cuadro() {
		super();
		this.estilo = "";
	}

	public Cuadro(String titulo, int siglo, String estilo) {
		super(titulo, siglo);
		this.estilo = estilo;
	}

	// GETTERS Y SETTERS

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	// ToSTRING

	@Override
	public String toString() {
		int siglo = getSiglo();
		if (super.getSiglo() < 0) {
			siglo = siglo * -2 + siglo;
		return "Título: " + super.getTitulo() + "\nSiglo " + siglo+" a.C" + "\nEstilo: " + estilo;
		}else {
			return "Título: " + super.getTitulo() + "\nSiglo " + super.getSiglo() + "\nEstilo: " + estilo;
		}
	}

}
