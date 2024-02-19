package iesjandula.proyectounidad4.arrays;

import java.util.Locale;

public class arrayLiterales {

	
	public static void pintarArray(int[] array) {
		
		for (int i=0; i<array.length; i++) {
			if(i==array.length-1) {
				System.out.format("|%-4d|",array[i]);
			}
			else {
			System.out.format("|%-4d",array[i]);
		}
		
		}
		
	}

	public static void pintarArray(int[] array, int numFinal) {
		
		for (int i=0; i<array.length && array[i]!= numFinal; i++) {
			if(i==array.length-1) {
				System.out.format("|%-4d|",array[i]);
			}
			else {
			System.out.format("|%-4d",array[i]);
		}
		
		}
		
	}
	
	public static void pintarArrayCadena(String[] array) {
		
		for (int i=0; i<array.length; i++) {
			if(i==array.length-1) {
				System.out.format("|%-20s|",array[i]);
			}
			else {
			System.out.format("|%-20s",array[i]);
		}
		
		}
		
	}
	
	
	
	public static void pintarArrayCadena(String[] array, String cadFinal) {
		
		for (int i=0; i<array.length && !array[i].equals(cadFinal); i++) {
			if(i==array.length-1) {
				System.out.format("|%-20s|",array[i]);
			}
			else {
			System.out.format("|%-20s",array[i]);
		}
		
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arrayDias= {1,2,3,4,5,6,7};
		
		int[] arrayDias2=new int [4];
		
		pintarArray(arrayDias);
		System.out.println();

		arrayDias2[6]=2;
		
	}
	
	

}
