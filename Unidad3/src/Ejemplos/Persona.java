package Ejemplos;

import java.time.LocalDate;

public class Persona {

	//posee nombre,apellido,numero de documento de identidad y año de nacimiento
	
	private String nombre;
	private String apellidos;
	private long id;
	private int anoNacimiento;
	private static int numPersonas=0;
	
	static {
		
		numPersonas=0;
	}
	
	public Persona() {
		
		numPersonas++;
	}
	
	public Persona (String nombre, String apellido, long id, int anoNacimiento) {
		//constructores
		this.nombre=nombre;
		this.apellidos=apellido;
		this.id=id;
		this.anoNacimiento=anoNacimiento;
		numPersonas++;
	}
	//metodos estaticos o de clase
	public static int getnumPersonas() {
		return numPersonas;
		
	}

	
	//metodos constructores
	public String getnombre() {
		return this.nombre;
		
	}
	public void setnombre(String nombre) {
		this.nombre=nombre;
	}
	public String getapellidos() {
		return this.apellidos;
		
	}
	public void setapellidos(String apellido) {
		this.apellidos=apellido;
	}
	public long getid() {
		return this.id;
		
	}
	public void setid(long id) {
		this.id=id;
	}
	public int getanoNacimiento() {
		return this.anoNacimiento;
		
	}
	public void setanoNacimiento(int anoNacimiento) {
		this.anoNacimiento=anoNacimiento;
	}
	//metodos funcionales
	public int calculaEdad(int anoActual) {
		
		return anoActual-anoNacimiento;
	
	}
	//Override al final
	@Override
	public String toString() {
        return "Persona [nombre=" + nombre + ", apellido = " + apellidos + ", id = " + id +
        		", Año de Nacimiento = "+anoNacimiento+"]";
    }	
}
