package ejercicios.ejercicio7;

public class Empleado {

	int identificador;
	String nombre;
	String apellidos;
	int edad;
	
	public Empleado() {
		identificador=100;
		nombre= "nuevo empleado";
		apellidos="nuevo empleado";
		edad=18;
	}
	
	public Empleado(int identificador, String nombre, String apellidos, int edad) {
		this.identificador = identificador;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
	
}
