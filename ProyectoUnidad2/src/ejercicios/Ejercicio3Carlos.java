package ejercicios;

import java.util.Scanner;


public class Ejercicio3Carlos {

	public static void main(String[] args) {

		int fecha;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("introduce el año");
		fecha = sc.nextInt();
		
		if ((fecha%4==0 && fecha%100!=0)
				||(fecha%100==0 && fecha%400==0)) {
		System.out.println("El año es bisiesto");
		}
		else {
			System.out.println("El año no es bisiesto");
		}
	}
}
