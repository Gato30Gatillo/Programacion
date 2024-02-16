package fundamentos;

import java.util.Scanner;

public class IfAnidado {
			
		public static void main(String[] args) {
			
			Integer numero=0;
			int numDivisores=0;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce un entero");
			numero = sc.nextInt();
			
			
			if (numero%2==0) {
				
				
				System.out.println("el numero " + numero + " es divisible por 2");
				
				numDivisores++;
			} else if (numero%3==0) {
					
					
					System.out.println("el numero " + numero + " es divisible por 3 y 6");
					numDivisores+=2;
					
					
				} else if (numero%5==0){
					
					
					System.out.println("el numero " + numero + " es divisible por 5 y 10");
					numDivisores+=2;
					
					
				}
				
				
		
		}
		
		
}
