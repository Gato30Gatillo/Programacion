package ejercicios;

import java.util.Scanner;

public class ejercicio25 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		a=sc.nextInt();
		System.out.println("introduce otro numero");
		b=sc.nextInt();
		if (a>b) {
			System.out.println(a+" > "+b);
		}
			else if(a<b) {
				System.out.println(b+" > "+a);
			}
			else {
			System.out.println(a+" - "+b);

		}
	}
}