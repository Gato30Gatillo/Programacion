package ejercicios.ejercicio3;

public enum EnumPelicula {

		Accion("Accion"),
		Comedia("Comedia"),
		Drama("Drama"),
		Suspenso("Suspense");
		
		private String genero;
		
		EnumPelicula(){
			
		}
		
		EnumPelicula(String genero) {
			// TODO Auto-generated constructor stub
			this.genero=genero;
		}
		
		public String getGenero() {
			return genero;
		}
		
		public void setGenero(String genero) {
			this.genero = genero;
		}	

}
