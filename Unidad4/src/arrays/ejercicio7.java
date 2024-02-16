package arrays;

import java.util.Scanner;

import arrays.arrayLiterales;

public class ejercicio7 {

public static String[] pintarArray(String[] lista) {
		
		Scanner sc= new Scanner(System.in);
		for (int i=0; i<lista.length; i++) {
		System.out.println("Escribe");
		lista[i]= sc.nextLine();
		}
		
		return lista;
	}
	


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] lista=new String[3];
		
		
		pintarArray(lista);
		System.out.println();
		arrayLiterales.pintarArrayCadena(lista,"");
		

		
		
	}
	
	
	
}
