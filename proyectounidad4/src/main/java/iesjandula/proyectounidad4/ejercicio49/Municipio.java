package iesjandula.proyectounidad4.ejercicio49;

public class Municipio {

	private String nombre;
	private int poblacion;
	private double temperaturaMedia;
	private double altitud;
	
	public Municipio() {
	}
	
	public Municipio(String nombre, int poblacion, double temperaturaMedia, double altitud) {
		super();
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.temperaturaMedia = temperaturaMedia;
		this.altitud = altitud;
	}
	public String getNombre() {
		return nombre;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public double getTemperaturaMedia() {
		return temperaturaMedia;
	}
	public double getAltitud() {
		return altitud;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	public void setTemperaturaMedia(double temperaturaMedia) {
		this.temperaturaMedia = temperaturaMedia;
	}
	public void setAltitud(double altitud) {
		this.altitud = altitud;
	}
	@Override
	public String toString() {
		return "Municipio [nombre=" + nombre + ", poblacion=" + poblacion + ", temperaturaMedia=" + temperaturaMedia
				+ ", altitud=" + altitud + "]";
	}
	
}
