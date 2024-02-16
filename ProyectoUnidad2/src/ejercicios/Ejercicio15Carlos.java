package ejercicios;

import java.util.Scanner;


public class Ejercicio15Carlos {

	public static void main(String[] args) {

		int alumnos,precio,preciototal;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el numero de alumnos");
		alumnos = sc.nextInt();
		if (alumnos>=100){
			precio=65;
			preciototal=alumnos*precio;
		System.out.println("Cada alumno debe pagar "+precio+" y el precio total es de "+preciototal);
		}
		else if (alumnos>=50&&alumnos<=99){
			precio=70;
			preciototal=alumnos*precio;
			System.out.println("Cada alumno debe pagar "+precio+" y el precio total es de "+preciototal);
		}
		else if (alumnos>=30&&alumnos<=49){
			precio=95;
			preciototal=alumnos*precio;
			System.out.println("Cada alumno debe pagar "+precio+" y el precio total es de "+preciototal);
		}
		else if (alumnos<30){
			preciototal=4000;
			System.out.println("El precio total es de "+preciototal);
		}
	}
}
