package Ejemplos;

import java.util.Scanner;

public class AppPersona {

	
	//el static boolean no puede estar dentro del static{}
	static boolean enEjecucion=false;
	
	private int variableObjeto;
	
	static {
	
		enEjecucion=true;
		
	}
	
	static boolean estaEnEjecucion() {
		return enEjecucion;
	}
	
	public int getVariableObjeto() {
		return variableObjeto;
	}
	
	public void setVariableObjeto(int variableObjeto) {
		this.variableObjeto=variableObjeto;
	}
	
	
	public static void main(String[] args) {
	
		//variableObjeto=2;
		//devuelveVariableObjeto();
		//no funcionan porque son metodos de tipo objeto
		
		AppPersona app=new AppPersona();
		
		app.variableObjeto=2;
		app.setVariableObjeto(2);
		
		app.getVariableObjeto();
		
		
		
		System.out.println("personas creadas " + Persona.getnumPersonas());
		
		System.out.println("programa en ejecucuion " + AppPersona.enEjecucion);
		
		Scanner sc= new Scanner(System.in);
		
		Persona jesus=new Persona("Jesus","soto",666,2004);
		
		System.out.println(jesus);
		
		System.out.println("personas creadas " + Persona.getnumPersonas());
		
		Persona alumno=new Persona();
		
		System.out.println("introduce el nombre");
		
		String nombre=sc.nextLine();
		
		alumno.setnombre(nombre);
		
		System.out.println("introdue el apellido");

		
		String apellidos=sc.nextLine();
		
		alumno.setapellidos(apellidos);

		System.out.println("introduce el id");

		
		long id=sc.nextLong();
		
		alumno.setid(id);

		System.out.println("introduce el año de nacimiento");

		
		int anoNacimiento=sc.nextInt();
		
		alumno.setanoNacimiento(anoNacimiento);
		
		System.out.println(alumno);
		
		System.out.println("personas creadas " + Persona.getnumPersonas());
		
	}
}
