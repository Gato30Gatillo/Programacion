package ejercicios;

import java.util.Scanner;

public class ejercicio213 {

	public static void main(String[] args) {
		int comida,numanimales,kilosanimales,falta,raciones;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce la comida diaria (en kilos) de la que se dispone");
		comida=sc.nextInt();
		System.out.println("introduce la cantidad de animales que hay");
		numanimales=sc.nextInt();
		System.out.println("introduce los kilos que come cada animal");
		kilosanimales=sc.nextInt();
		if (comida>numanimales*kilosanimales) {
			System.out.println("hay suficiente comida");
		}
			else {
				falta=(numanimales*kilosanimales)-comida;
				raciones=comida/numanimales;
				System.out.println("faltan "+falta+" kilos de comida");
				System.out.println("cada animal recibira "+raciones+" kilos de comida");
			}
		
}
	}