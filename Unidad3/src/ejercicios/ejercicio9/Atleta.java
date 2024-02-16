package ejercicios.ejercicio9;

public class Atleta {

	int identificador=cantidadAtletas;
	String nombre;
	double Tiempo;
	static int cantidadAtletas;
	static String seleccion="colombia";
	static double tiempoEquipo;
	
	public Atleta() {
		cantidadAtletas++;
	}
	
	public Atleta(String nombre, double Tiempo) {
		
		
		this.nombre = nombre;
		Tiempo = Tiempo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTiempo() {
		return Tiempo;
	}

	public void setTiempo(double tiempo) {
		Tiempo = tiempo;
	}
	
	public static void correr400Metros(double tiempo1,double tiempo2,double tiempo3,double tiempo4) {
		
		tiempoEquipo=tiempo1+tiempo2+tiempo3+tiempo4;
	}
	
	static void seleccion() {
		System.out.println(seleccion);
	}
	static void tiempo() {
		System.out.println(tiempoEquipo);
	}
	
	
}
