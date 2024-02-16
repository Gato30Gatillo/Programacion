package ejercicios;

import java.util.Scanner;

public class EjerciciosCarlos18 {

	public static void main(String[] args) {
		int grados, kelvin, fahrenheit,opcion;		
		Scanner sc = new Scanner(System.in);
			System.out.println("Introduce los grados ");
			grados = sc.nextInt();
			System.out.println("¿Quieres pasar a 1 kelvin o 2 fahrenheit? ");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1-> {
				kelvin = grados+273;
				System.out.println(grados+" Grados equivalen a "+kelvin);
			}
			case 2-> {
				fahrenheit = (grados*9/5)+32;
				System.out.println(grados+" Grados equivalen a "+fahrenheit);
			}
			}
	}
	}