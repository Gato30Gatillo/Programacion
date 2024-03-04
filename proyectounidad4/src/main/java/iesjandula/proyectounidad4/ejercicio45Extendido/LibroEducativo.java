package iesjandula.proyectounidad4.ejercicio45Extendido;

public class LibroEducativo extends Libro {

	private String materia;
	
	
	public LibroEducativo(String titulo, String autor, int anoPublicacion, String editorial,
			String referenciaBibliografica,String materia, EnumLibro tipoLibro) {
		super(titulo,autor, anoPublicacion, editorial, referenciaBibliografica,tipoLibro);
		this.materia = materia;
	}


	@Override
	public EnumLibro tipoLibro() {
		// TODO Auto-generated method stub
		return EnumLibro.EDUCATIVO;
	}

}
