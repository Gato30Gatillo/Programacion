package ejercicios;

import java.util.Scanner;

public class ejercicio215 {

	public static void main(String[] args) {
		double a,b,resultado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce el coeficiente a ");
		a=sc.nextDouble();
		System.out.println("introduce el coeficiente b");
		b=sc.nextDouble();
				resultado=(a*b)/2;
		if (a>0&&b>0) {
			System.out.println("el area es "+resultado);
			}
			else {
			System.out.println("No tiene sentido, al menos un numero es negativo");

		}
	}
}