package iesjandula.proyectounidad4.ejercicio.eningles.exercise24;

import iesjandula.proyectounidad4.ejemplosenclase.ArrayMetodos;

public class exercise24 {

	private static int getNumEvenNumbersInArray(Integer[] array) {
		
		int cont=0;
		
		for (Integer item: array) {
			if(item%2==0) {
				cont++;
			}
		}
		
		return cont;
	}
	
	public static Integer[] evenArray(Integer[] array1,Integer[] array2) {
		int tamArrayRes= getNumEvenNumbersInArray(array1) + getNumEvenNumbersInArray(array2);
		Integer[] arrayRes =new Integer[tamArrayRes];
		int cont=0;
		for (Integer item: array1) {
			if(item%2==0) {
				arrayRes[cont]=item;
				cont++;
			}
		}
		
		for (Integer item: array2) {
			if(item%2==0) {
				arrayRes[cont]=item;
				cont++;
			}
		}
		
		return arrayRes;
		
	}
	
private static int getNumOddNumbersInArray(Integer[] array) {
		
		int cont=0;
		
		for (Integer item: array) {
			if(item%2!=0) {
				cont++;
			}
		}
		
		return cont;
	}
	
	public static Integer[] OddArray(Integer[] array1,Integer[] array2) {
		int tamArrayRes= getNumOddNumbersInArray(array1) + getNumOddNumbersInArray(array2);
		Integer[] arrayRes =new Integer[tamArrayRes];
		int cont=0;
		for (Integer item: array1) {
			if(item%2!=0) {
				arrayRes[cont]=item;
				cont++;
			}
		}
		
		for (Integer item: array2) {
			if(item%2!=0) {
				arrayRes[cont]=item;
				cont++;
			}
		}
		
		return arrayRes;
		
	}
}
