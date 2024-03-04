package iesjandula.proyectounidad4.ejercicio45Extendido;

public class Test {

	public static void main(String[] args) {

		Biblioteca biblio = new Biblioteca("real");
		
		Libro libro1= new LibroFiccion("Cien años de soledad","Gabriel Garcia Marques", 1967,"Sudamerica","858.67.M566",EnumLibro.NOVELA);
		Libro libro2= new LibroEducativo("Rayuela","Julio Cortazar", 1963,"Sudamerica","868.55.J667","Matematicas",EnumLibro.EDUCATIVO);
		
		biblio.añadirLibro(libro1);
		biblio.añadirLibro(libro2);
		
		biblio.ListarLibros();
		
		
		
	}

}
