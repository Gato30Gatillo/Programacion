package buclesfor;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		
		int n;
		int solucion=0,sumaSolucion=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("selecciona el numero hasta el que debe legar el valor de n"
				+ "en la expresion 5n-3 ");
		n= sc.nextInt();
		for (int i=0;i<=n;i++) {
			solucion = 5*i-3;
				System.out.println("A"+i+" = "+  solucion);
				sumaSolucion=+solucion;
		}
		System.out.println("la suma de todas las ecuaciones es: "+  sumaSolucion);
	}



	}
