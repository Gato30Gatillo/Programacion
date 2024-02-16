package ejercicios;

import java.util.Scanner;

public class ecuacion {

	public static void main(String[] args) {
		double a,b,c,d,resultado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce el coeficiente a ");
		a=sc.nextDouble();
		System.out.println("introduce el coeficiente b");
		b=sc.nextDouble();
		System.out.println("introduce el coeficiente c");
		c=sc.nextDouble();
		d=(Math.pow(b, 2))-(4*a*c);
		if (d>0) {
			System.out.println("hay dos soluciones ");
			resultado=((-b)+Math.sqrt(d))/(2*a);
			System.out.print("la primera solucion es "+resultado);
			resultado=((-b)-Math.sqrt(d))/(2*a);
			System.out.print(" la segunda solucion es "+resultado);
		}
			else if(d==0) {
				resultado= (-b)/(2*a);
				System.out.println("Solo hay una solución. La solucion es "+resultado);
			}
			else {
			System.out.println("No hay solución");

		}
	}
}