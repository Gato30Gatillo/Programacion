package ejercicios;

import java.util.Scanner;


public class Ejercicio11Carlos {

	public static void main(String[] args) {

		int renta;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("introduce tu renta anual");
		renta = sc.nextInt();
		if (renta<10000){
		System.out.println("Tu tipo de impositivo es del 5%");
		}
		else if (renta>=10000&&renta<=20000){
			System.out.println("Tu tipo de impositivo es del 15%");
		}
		else if (renta>20000&&renta<=35000){
			System.out.println("Tu tipo de impositivo es del 20%");
		}
		else if (renta>35000&&renta<=60000){
			System.out.println("Tu tipo de impositivo es del 30%");
		}
		else if (renta>60000){
			System.out.println("Tu tipo de impositivo es del 45%");
		}
		else {
			System.out.println("No tienes impositivo");
		}
	}
}
