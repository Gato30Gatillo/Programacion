package ejercicio.eningles.exercise22;

import ejemplosenclase.ArrayMetodos;

public class Ejercicio22 {

	public static String DeleteDuplicateElement(Integer[] arrayParam) {
		
		String cadena="The unique elements of the array are: " + arrayParam[0];
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
				cadena= cadena +", "+arrayParam[i];
			}
			
		}
		return cadena;
	}
	public static void main(String[] args) {
		
		
		Integer[] arrayInt= ArrayMetodos.rellenaArrayAleatoriosWrap(10,20,25);
		String cadena;
		ArrayMetodos.mostrarArray(arrayInt);
		
		cadena=DeleteDuplicateElement(arrayInt);
		
		System.out.println(cadena);
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> fc74cef22feba98a27b48c2208443cc57b24fdf5
