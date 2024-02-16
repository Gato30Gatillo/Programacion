package fundamentos;

import java.util.Scanner;


public class InputOutputEjemplo {
	
	
	public static void main(String[] args) {
		
		double miDouble=0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero con formato ddd.aaa, i.e. 55.666");
		miDouble = sc.nextDouble();

		System.out.println("The el numero leido por la entrada es:"+ miDouble);
		
	}

}
