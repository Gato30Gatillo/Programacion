package fundamentos;

import java.util.Scanner;



public class InputOutputEjemplo2 {
	final int MAX_TEMP = 120;
	
	public static void main(String[] args) {
		
		int edad=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la edad de la Persona");
		edad = sc.nextInt();
		
		
		if (edad>= 18)
			System.out.println("La persona es un adulto");
		else if (edad<18)
			
			System.out.println("La persona es menor de edad");
		
		else if (edad<0)
			
			System.out.println("La persona no ha nacido");
		else if (edad>=150)  
		
			System.out.println("La persona no es humana con esa edad");
		
		
	}
}
