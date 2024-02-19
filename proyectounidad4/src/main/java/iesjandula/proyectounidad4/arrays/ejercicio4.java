package iesjandula.proyectounidad4.arrays;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ejercicio4 {
	
	
	public static int[] crearArrayConNumerosAleatorios(int tam) {
		
		int[]array=new int [tam];
		
		for(int i=0; i<tam;i++){
			Random rd=new Random();
			array[i]= (int) rd.nextInt(100);
			
			System.out.print("|"+array[i]+"|");
		}
		
		return array;
		
	}
	
	private static void cuadrado(int[] array) {
		for(int i=0; i<array.length;i++) {
			array[i]=(int) Math.pow(array[i],2);
			System.out.print(array[i]+"|");
		}
	}
	
	
	private static void cubo(int[] array) {
		for(int i=0; i<array.length;i++) {
			array[i]=(int) Math.pow(array[i],3);
			System.out.print(array[i]+"|");
		}
	}
	
	
	public static void main(String[] args) {

		int[] array=new int[20];
		
		array=crearArrayConNumerosAleatorios(20);
		System.out.println("");
		cuadrado(array);
		System.out.println("");
		cubo(array);
	}


}
