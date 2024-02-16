package ejercicios;
import java.util.Scanner;

public class ejercicio22 {
	public static void main(String [] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		a=sc.nextInt();
		System.out.println("introduce otro numero");
		b=sc.nextInt();
		if (a==b) {
			System.out.println("los numeros son iguales");
		}
			else {
				System.out.println("los numeros no son iguales");

			}
	}
}
