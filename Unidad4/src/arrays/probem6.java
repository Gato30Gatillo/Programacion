package arrays;

import java.util.Scanner;

import arrays.arrayLiterales;

public class probem6 {

	
	public static int[] LeeryGuardarArray(int[] lista) {
		
		Scanner sc= new Scanner(System.in);
		int a=0;
		for (int i=0; i<lista.length; i++) {
		System.out.println("introduce un numero");
		lista[i]= sc.nextInt();
		}
		
		arrayLiterales.pintarArray(lista,0);
		return lista;
	}

	
	public static int[] parArrayMejorado(int[] lista) {
		
		Scanner sc= new Scanner(System.in);
		int a=0, cont=0;
		for (int i=0; i<lista.length; i++) {
		System.out.println("introduce un numero");
		a= sc.nextInt();
		if(a%2==0) {
			lista[cont]=a;
			cont++;
		}
		}
		arrayLiterales.pintarArray(lista,0);
		return lista;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lista=new int[10];
		int[] lista2=new int[10];
		
		
		parArrayMejorado(lista2);
		System.out.println("");
		
		LeeryGuardarArray(lista);

		
		
	}
	
	
}
