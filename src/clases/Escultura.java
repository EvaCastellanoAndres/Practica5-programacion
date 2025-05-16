package clases;

public class Escultura extends ObraDeArte {
	private String material;

	public Escultura() {
		super();
		this.material = "";
	}

	public Escultura(String titulo, int siglo, String material) {
		super(titulo, siglo);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		int siglo = getSiglo();
		if (super.getSiglo() < 0) {
			siglo = siglo * -2 + siglo;
			return "Título: " + super.getTitulo() + "\nSiglo " + siglo + " a.C" + "\nMaterial: " + material;
		} else {
			return "Título: " + super.getTitulo() + "\nSiglo " + siglo + "\nMaterial: " + material;
		}
	}

}
