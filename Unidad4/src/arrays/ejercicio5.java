package arrays;

import java.util.Locale;

import java.util.Scanner;

public class ejercicio5 {
	
	
	public static void pintarArray(int[] lista) {
		
		Scanner sc= new Scanner(System.in);
		
		for (int i=0; i<lista.length; i++) {
		System.out.println("introduce un numero");
		lista[i]= sc.nextInt();
		}
		
		for (int i=0; i<lista.length; i++) {
			System.out.print("|"+lista[i]+"|");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lista=new int[11];
		
		pintarArray(lista);
		
		
	}


}
