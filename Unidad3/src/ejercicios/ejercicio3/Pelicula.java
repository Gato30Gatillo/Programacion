package ejercicios.ejercicio3;

public class Pelicula {


		private String nombre;
		private String director;
		private EnumPelicula genero;
		private int duracion;
		private int año;
		private EnumCalificacion Calificacion;
		
		Pelicula(){
			
		}
		
		Pelicula(String nombre, String director, EnumPelicula genero, int duracion, int año, EnumCalificacion calificacion) {
			// TODO Auto-generated constructor stub
			this.nombre=nombre;
			this.director=director;
			this.genero=genero;
			this.duracion=duracion;
			this.año=año;
			this.Calificacion=calificacion;
		}

		public EnumCalificacion getCalificacion() {
			return Calificacion;
		}

		public void setCalificacion(EnumCalificacion calificacion) {
			Calificacion = calificacion;
		}

		public String getNombre() {
			return nombre;
		}

		public String getDirector() {
			return director;
		}

		public EnumPelicula getGenero() {
			return genero;
		}

		public int getDuracion() {
			return duracion;
		}

		public int getAño() {
			return año;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public void setDirector(String director) {
			this.director = director;
		}

		public void setGenero(EnumPelicula genero) {
			this.genero = genero;
		}

		public void setDuracion(int duracion) {
			this.duracion = duracion;
		}

		public void setAño(int año) {
			this.año = año;
		}

		
		
		private boolean esPeliculaEpica() {
			return this.duracion>=180; 
		}
		
		private String calcularValoracion() {
			
			String resultado="";
			if(this.Calificacion<=EnumCalificacion.Muy_Mala.getMaxCalification()) {
				resultado=EnumCalificacion.Muy_Mala.getDescripcion();
			}
			else if(this.Calificacion<=EnumCalificacion.Mala.getMaxCalification()){
				resultado=EnumCalificacion.Mala.getDescripcion();
			}
			else if(this.Calificacion<=EnumCalificacion.Regular.getMaxCalification()){
				resultado=EnumCalificacion.Regular.getDescripcion();
			}
			else if(this.Calificacion<=EnumCalificacion.Buena.getMaxCalification()) {
				resultado=EnumCalificacion.Buena.getDescripcion();
			}
			else {
				resultado=EnumCalificacion.Muy_Buena.getDescripcion();
			}
			return resultado;
		}
		
		public boolean esSimilar(Pelicula pelicula) {
			
			return this.genero.equals(pelicula) && this.Calificacion==pelicula.getCalificacion();
		}

		@Override
		public String toString() {
			return "Pelicula [nombre=" + nombre + ", director=" + director + ", genero=" + genero + ", duracion="
					+ duracion + ", año=" + año + ", Calificacion=" + Calificacion + "]";
		}
	
	
}
