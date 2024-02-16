package ejercicio.eningles.exercise16_17;

import ejemplosenclase.ArrayMetodos;

public class Ejercicio16_17 {

	private static int contarPositivos(Integer[] arrayParam) {
		   int contador=0;
		   
		   for (Integer num: arrayParam) {
			   if(num>0) {
				   contador++;
			   }
		   }
		   return contador;
	}
	
	private static int contarNegativos(Integer[] arrayParam) {
		   int contador=0;
		   
		   for (Integer num: arrayParam) {
			   if(num<0) {
				   contador++;
			   }
		   }
		   return contador;
	}
	
	
	public static Integer[] returnArrayWithPositives(Integer[] arrayParam) {
		
		Integer[] arrayRes = new Integer[contarPositivos(arrayParam)];
		int cont=0;
		for (int i=0;i<arrayParam.length;i++) {
			   if(arrayParam[i]>0) {
				   arrayRes[cont]=arrayParam[i];
				   cont++;
			   }
		   }
		return arrayRes;
		
	}
	
public static Integer[] returnArrayWithNegatives(Integer[] arrayParam) {
		
		Integer[] arrayRes = new Integer[contarNegativos(arrayParam)];
		int cont=0;
		for (int i=0;i<arrayParam.length;i++) {
			   if(arrayParam[i]<0) {
				   arrayRes[cont]=arrayParam[i];
				   cont++;
			   }
		   }
		return arrayRes;
		
	}
		 
	public static void main(String[] args) {
		
		
		Integer[] arrayInt= ArrayMetodos.rellenaArrayAleatoriosWrap(20,-50, 50);
		
		ArrayMetodos.mostrarArray(arrayInt);
		
		arrayInt=returnArrayWithPositives(arrayInt);
		
		ArrayMetodos.mostrarArray(arrayInt);
		

		Integer[] arrayInt2= ArrayMetodos.rellenaArrayAleatoriosWrap(20,-50, 50);
		
		ArrayMetodos.mostrarArray(arrayInt2);
		
		arrayInt2=returnArrayWithNegatives(arrayInt2);
		
		ArrayMetodos.mostrarArray(arrayInt2);
		
		
	}
	
	
}
