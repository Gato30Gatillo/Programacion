package iesjandula.proyectunidad5.ejercicio45Extendido;

public class LibroFiccion extends Libro {

	public LibroFiccion(String titulo, Autor autor, int annioPublicacion, String editorial, String referencia,
			EnumLibro tipoLibro) {
		super(titulo, autor, annioPublicacion, editorial, referencia, tipoLibro);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean esEducativo() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}