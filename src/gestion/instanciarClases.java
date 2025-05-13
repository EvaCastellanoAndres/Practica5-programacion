package gestion;

import clases.GestionMuseo;

public class instanciarClases {
	public static void crearMuseos(GestionMuseo gestion) {
		gestion.altaMuseo("El Prado", 2500, 15);
		gestion.altaMuseo("Louvre", 3000, 17.5);
		gestion.altaMuseo("de Arte Moderno", 1800, 12);
		gestion.altaMuseo("Guggenheim Bilbao", 1500, 16);
		gestion.altaMuseo("Thyssen-Bornemisza", 2000, 13.5);
	}

	public static void crearCuadros(GestionMuseo gestion) {
		gestion.altaCuadro("Mujer con sombrilla", 17, "Impresionista");
		gestion.altaCuadro("La noche estrellada", 19, "Postimpresionista");
		gestion.altaCuadro("Guernica", 20, "Cubismo");
		gestion.altaCuadro("El nacimiento de Venus", 15, "Renacimiento");
		gestion.altaCuadro("El grito", 19, "Expresionismo");
		gestion.altaCuadro("Las Meninas", 17, "Barroco");
		gestion.altaCuadro("El jardín de las delicias", 15, "Gótico tardío");
		gestion.altaCuadro("La persistencia de la memoria", 20, "Surrealismo");
		gestion.altaCuadro("Los girasoles", 19, "Postimpresionista");
		gestion.altaCuadro("La libertad guiando al pueblo", 19, "Romanticismo");
		gestion.altaCuadro("La joven de la perla", 17, "Barroco");
		gestion.altaCuadro("El almuerzo sobre la hierba", 19, "Impresionista");
	}

	public static void crearEsculturas(GestionMuseo gestion) {
		gestion.altaEscultura("David", 13, "bronce");
		gestion.altaEscultura("El Pensador", 20, "bronce");
		gestion.altaEscultura("Venus de Milo", 2, "mármol");
		gestion.altaEscultura("La Piedad", 15, "mármol");
		gestion.altaEscultura("Moái", 10, "piedra volcánica");
		gestion.altaEscultura("Busto de Nefertiti", -14, "piedra caliza");
		gestion.altaEscultura("Columnas del Partenón", -5, "mármol");
		gestion.altaEscultura("Discóbolo", -5, "bronce");
		gestion.altaEscultura("El Éxtasis de Santa Teresa", 17, "mármol");
		gestion.altaEscultura("Escultura sin título", 21, "acero inoxidable");
	}

	public static void crearObrasDeArte(GestionMuseo gestion) {
		gestion.altaObraDeArte("Jarrones de David", 12);
		gestion.altaObraDeArte("Mosaico de Baco", 3);
		gestion.altaObraDeArte("Tapiz de Bayeux", 11);
		gestion.altaObraDeArte("Fresco de la villa de los misterios", -1);
		gestion.altaObraDeArte("Jarrón de las serpientes", -7);
		gestion.altaObraDeArte("Relieve de Asurbanipal", -7);
		gestion.altaObraDeArte("Mosaico bizantino de Rávena", 6);
		gestion.altaObraDeArte("Jarrón de cerámica islámica", 10);
		gestion.altaObraDeArte("Fresco de la Capilla Sixtina", 16);
		gestion.altaObraDeArte("Tesserae romana", -2);
	}

	public static void crearEmpleados(GestionMuseo gestion) {
		gestion.altaEmpleado("Ana", "Carreras", "12345678A", 1500, "El Prado");
		gestion.altaEmpleado("Eva", "Castellano", "3323560X", 1500, "El Prado");
		gestion.altaEmpleado("Carlos", "Pérez", "98765432B", 1400, "Louvre");
		gestion.altaEmpleado("María", "Martínez", "23456789C", 1200, "de Arte Moderno");
		gestion.altaEmpleado("José", "Ramírez", "34567890D", 1600, "Guggenheim Bilbao");
		gestion.altaEmpleado("Laura", "Gómez", "45678901E", 1300, "Thyssen-Bornemisza");
		gestion.altaEmpleado("Javier", "Rodríguez", "56789012F", 1500, "El Prado");
		gestion.altaEmpleado("Isabel", "Sánchez", "67890123G", 1400, "Louvre");
		gestion.altaEmpleado("Pedro", "Díaz", "78901234H", 1150, "de Arte Moderno");
		gestion.altaEmpleado("Sofía", "Ruiz", "89012345I", 1350, "Guggenheim Bilbao");
		gestion.altaEmpleado("Ricardo", "Fernández", "90123456J", 1450, "Thyssen-Bornemisza");
	}

	public static void crearEventos(GestionMuseo gestion) {
		gestion.altaEvento("Exposición de Arte Barroco", gestion.devolverEmpleado("12345678A"), "2010-03-01",
				"2010-03-10", "Pintura Barroca", gestion.devolverMuseo("El Prado"));

		gestion.altaEvento("Impresionismo Francés", gestion.devolverEmpleado("3323560X"), "2023-04-10", "2023-04-25",
				"Impresionismo", gestion.devolverMuseo("Louvre"));

		gestion.altaEvento("Vanguardias del Siglo XX", gestion.devolverEmpleado("98765432B"), "2025-05-05",
				"2025-05-20", "Arte Moderno", gestion.devolverMuseo("de Arte Moderno"));

		gestion.altaEvento("Escultura Contemporánea", gestion.devolverEmpleado("23456789C"), "2025-06-01", "2025-06-18",
				"Escultura", gestion.devolverMuseo("Guggenheim Bilbao"));

		gestion.altaEvento("Fotografía del Siglo XXI", gestion.devolverEmpleado("34567890D"), "2019-07-10",
				"2019-07-25", "Fotografía", gestion.devolverMuseo("Thyssen-Bornemisza"));

		gestion.altaEvento("Arte y Tecnología", gestion.devolverEmpleado("45678901E"), "2025-08-15", "2025-08-30",
				"Arte Digital", gestion.devolverMuseo("Guggenheim Bilbao"));

		gestion.altaEvento("El Renacimiento Italiano", gestion.devolverEmpleado("56789012F"), "2025-09-01",
				"2025-09-15", "Renacimiento", gestion.devolverMuseo("El Prado"));

		gestion.altaEvento("Surrealismo y Más Allá", gestion.devolverEmpleado("67890123G"), "2025-10-05", "2025-10-20",
				"Surrealismo", gestion.devolverMuseo("Louvre"));

		gestion.altaEvento("Mujeres en el Arte", gestion.devolverEmpleado("78901234H"), "2025-11-01", "2025-11-15",
				"Arte Feminista", gestion.devolverMuseo("de Arte Moderno"));

		gestion.altaEvento("Arte Abstracto Internacional", gestion.devolverEmpleado("89012345I"), "2025-12-01",
				"2025-12-16", "Abstracción", gestion.devolverMuseo("Thyssen-Bornemisza"));

	}

	public static void crearEventosBeneficos(GestionMuseo gestion) {
		gestion.altaEventoBenefico("Arte por la Infancia", "12345678A", // Ana
				"2025-03-01", "2025-03-15", "Pintura Infantil", "El Prado", "Lucha contra la pobreza infantil", 10000,
				8500);

		gestion.altaEventoBenefico("Colores para Ucrania", "3323560X", // Eva
				"2025-04-01", "2025-04-14", "Arte y paz", "Louvre", "Apoyo a víctimas de guerra", 15000, 15750);

		gestion.altaEventoBenefico("Arte Solidario", "98765432B", // Carlos
				"2025-05-10", "2025-05-25", "Arte contemporáneo", "de Arte Moderno",
				"Recaudación para investigación del cáncer", 20000, 19300);

		gestion.altaEventoBenefico("Escultura con Esperanza", "23456789C", // María
				"2025-06-05", "2025-06-18", "Escultura moderna", "Guggenheim Bilbao",
				"Recaudación para refugios de animales", 5000, 6100);

		gestion.altaEventoBenefico("Luz sobre el Alzheimer", "34567890D", // José
				"2025-07-10", "2025-07-25", "Arte expresionista", "Thyssen-Bornemisza",
				"Concientización sobre el Alzheimer", 12000, 9800);

		gestion.altaEventoBenefico("Imágenes del Cambio", "45678901E", // Laura
				"2025-08-01", "2025-08-15", "Fotografía social", "Guggenheim Bilbao",
				"Cambio climático y medio ambiente", 9000, 9400);

		gestion.altaEventoBenefico("Obras por la Educación", "56789012F", // Javier
				"2025-09-10", "2025-09-24", "Arte clásico", "El Prado", "Educación en zonas rurales", 8000, 8000);

		gestion.altaEventoBenefico("Surrealismo con Corazón", "67890123G", // Isabel
				"2025-10-05", "2025-10-20", "Surrealismo", "Louvre", "Salud mental y prevención del suicidio", 15000,
				13400);

		gestion.altaEventoBenefico("Arte sin Barreras", "78901234H", // Pedro
				"2025-11-01", "2025-11-15", "Arte inclusivo", "de Arte Moderno",
				"Acceso al arte para personas con discapacidad", 11000, 11700);

		gestion.altaEventoBenefico("Colores de Esperanza", "89012345I", // Sofía
				"2025-12-01", "2025-12-16", "Arte abstracto", "Thyssen-Bornemisza", "Lucha contra el cáncer infantil",
				18000, 18500);

	}

	public static void crearEventosGenericos(GestionMuseo gestion) {
		gestion.altaEventoGenerico("Taller de Pintura para Jóvenes", "12345678A", // Ana
				"2025-03-20", "2025-03-21", "Pintura", "El Prado", "Taller", "Adolescentes", true);

		gestion.altaEventoGenerico("Charla sobre Impresionismo", "3323560X", // Eva
				"2025-04-12", "2025-04-12", "Impresionismo", "Louvre", "Charla", "Público general", false);

		gestion.altaEventoGenerico("Visita Guiada Especial", "98765432B", // Carlos
				"2025-05-18", "2025-05-18", "Arte Moderno", "de Arte Moderno", "Visita guiada", "Turistas", true);

		gestion.altaEventoGenerico("Taller de Escultura en Arcilla", "23456789C", // María
				"2025-06-10", "2025-06-12", "Escultura", "Guggenheim Bilbao", "Taller", "Adultos", true);

		gestion.altaEventoGenerico("Mesa redonda sobre Arte y Sociedad", "34567890D", // José
				"2025-07-15", "2025-07-15", "Arte contemporáneo", "Thyssen-Bornemisza", "Mesa redonda",
				"Académicos y estudiantes", false);

		gestion.altaEventoGenerico("Visita Interactiva para Escolares", "45678901E", // Laura
				"2025-08-05", "2025-08-06", "Educación artística", "Guggenheim Bilbao", "Visita guiada",
				"Niños en edad escolar", true);

		gestion.altaEventoGenerico("Ciclo de Cine y Arte", "56789012F", // Javier
				"2025-09-20", "2025-09-22", "Relación entre cine y arte", "El Prado", "Ciclo de cine",
				"Cinéfilos y artistas", false);

		gestion.altaEventoGenerico("Taller de Grabado", "67890123G", // Isabel
				"2025-10-08", "2025-10-10", "Técnicas de grabado", "Louvre", "Taller", "Adultos mayores", true);

		gestion.altaEventoGenerico("Charla: Arte como terapia", "78901234H", // Pedro
				"2025-11-03", "2025-11-03", "Arte y bienestar", "de Arte Moderno", "Charla", "Psicólogos y terapeutas",
				false);

		gestion.altaEventoGenerico("Encuentro de Jóvenes Artistas", "89012345I", // Sofía
				"2025-12-05", "2025-12-06", "Arte emergente", "Thyssen-Bornemisza", "Encuentro", "Jóvenes artistas",
				true);

	}
}
