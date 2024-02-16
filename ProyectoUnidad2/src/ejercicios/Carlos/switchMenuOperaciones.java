package ejercicios.Carlos;

import java.util.Scanner;

public class switchMenuOperaciones {
	public static void main(String[] args) {

		int opcionNumero=0,num,num2;  
		double resultado; 

		Scanner sc = new Scanner(System.in);
		while(opcionNumero != 5) {
			
		System.out.println("Que operación vas a usar?");
		System.out.println();
		System.out.println(" 1. Suma");
		System.out.println(" 2. Resta");
		System.out.println(" 3. Multiplicacion");
		System.out.println(" 4. Division");
		System.out.println(" 5. salir");
		System.out.println();
		System.out.println("Introduce el numero seleccionado entre 1 y 5: ");
		opcionNumero = sc.nextInt();
		
		switch (opcionNumero) {
		case 1:
			System.out.println("Introduce el primer número  ");
			num = sc.nextInt();
			System.out.println("Introduce el Segundo número ");
			num2 = sc.nextInt();
			resultado=num+num2;
			System.out.println("El resultado de la operación es: " + resultado);
			break;
		case 2:
			System.out.println("Introduce el primer número  ");
			num = sc.nextInt();
			System.out.println("Introduce el segundo número ");
			num2 = sc.nextInt();
			resultado=num-num2;
			System.out.println("El resultado de la operación es: " + resultado);
		case 3:
			System.out.println("Introduce el primer número  ");
			num = sc.nextInt();
			System.out.println("Introduce el Segundo número ");
			num2 = sc.nextInt();
			resultado=num*num2;
			System.out.println("El resultado de la operación es: " + resultado);
		case 4:
			System.out.println("Introduce el dividendo  ");
			num = sc.nextInt();
			System.out.println("Introduce el divisor ");
			num2 = sc.nextInt();
			resultado=num/num2;
			System.out.println("El resultado de la operación es: " + resultado);
		case 5:
			System.out.println("salimos del programa");
			break;
		default: 
			System.out.println("No ha introdución una opción contemplada en el menú");
			break;

		}
		
      System.out.println("Fuera del switch");
	}

}
}