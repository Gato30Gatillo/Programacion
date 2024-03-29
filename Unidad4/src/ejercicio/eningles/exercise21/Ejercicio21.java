package ejercicio.eningles.exercise21;

import ejemplosenclase.ArrayMetodos;

public class Ejercicio21 {

	public static Integer[] DeleteDuplicateElement(Integer[] arrayParam) {
		
		Integer[] arrayRes = new Integer[arrayParam.length];
		int cont=1;
		arrayRes[0]=arrayParam[0];
		boolean repetido=false;
		for (int i=0;i<arrayParam.length-1;i++) {	
			repetido=false;
			for (int j=0;j<arrayParam.length-1 && !repetido;j++) {	
				if(arrayRes[j]==arrayParam[i]) {
					repetido=true;
				}
			}
			
			if(!repetido) {//no se ejecuta lo de dentro
				arrayRes[cont]=arrayParam[i];
				cont++;
			}
			
		}
		
		Integer[] arrayEnd = new Integer[cont];
		for (int i=0;i<cont;i++) {
			arrayEnd[i]=arrayRes[i];
		}
		return arrayEnd;
	}
	public static void main(String[] args) {
		
		
		Integer[] arrayInt= ArrayMetodos.rellenaArrayAleatoriosWrap(10,20,25);
		
		ArrayMetodos.mostrarArray(arrayInt);
		
		arrayInt=DeleteDuplicateElement(arrayInt);
		
		ArrayMetodos.mostrarArray(arrayInt);
	}
}
