package iesjandula.proyectounidad4.ejercicio45Extendido;

public class LibroFiccion extends Libro {

	public LibroFiccion(String titulo, String autor, int anoPublicacion, 
			String editorial, String referenciaBibliografica, EnumLibro tipoLibro) {
		super(titulo,autor, anoPublicacion, editorial, referenciaBibliografica,tipoLibro);
	}
	@Override
	public EnumLibro tipoLibro() {
		// TODO Auto-generated method stub
		return this.getTipoLibro();
	}

}
