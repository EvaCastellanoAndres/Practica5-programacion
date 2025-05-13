package programa;

import clases.*;

public class Programa {

	public static void main(String[] args) {
		GestionMuseo gestion = new GestionMuseo();
		gestion.altaMuseo("El Prado", 2500, 15);
		gestion.listarMuseos();

		gestion.altaObraDeArte("Jarrones de David", 12);
		
		Cuadro cuadro1 = new Cuadro("Mujer con sombrilla", 17, "Impresionista");
		Escultura escultura1 =new Escultura();
		
		GestionMuseo gestionMuseo = new GestionMuseo();
		gestion.listarObrasDeArte();
	}

}
