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
		return "Escultura:  \n"+super.toString()+", material: " + material;
	}

}
