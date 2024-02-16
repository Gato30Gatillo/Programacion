package ejercicios;
import java.util.Scanner;

public class Ejemplo {
	public static void main(String [] args) {
		int edad;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ¿Cual es tu edad?");
		edad=sc.nextInt();
		if (edad<18) {
		System.out.println("Eres menor de edad");
			if (edad<13) {
				if (edad<3) {
					System.out.println("Ademas eres un bebe");
				}
				else {
					System.out.println("Ademas eres un niño");
				}
			}
		else {
				System.out.println("Ademas eres un adolescente");
		}
		}
		else {
			System.out.println("Eres mayor de edad");
			if (edad>66) {
				System.out.println("Ademas eres un jubilado");

			}
			else {
				System.out.println("Ademas no eres jubilado");
			}
		}
	}
}
