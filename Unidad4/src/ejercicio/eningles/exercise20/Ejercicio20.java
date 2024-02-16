package ejercicio.eningles.exercise20;

import ejemplosenclase.ArrayMetodos;

public class Ejercicio20 {

	public static String searchElement(Integer[] arrayParam, Integer number) {
		
		int posicion=1;
		int index=0;
		
		for (Integer num: arrayParam) {
			   if(num==number) {
				   return " Element is found in position "+posicion+"\n Element is found is index "+index;
			   }
			   posicion++;
			   index++;
		   }
		return "No esta";
	}
	public static void main(String[] args) {
		
		
		Integer[] arrayInt= ArrayMetodos.rellenaArrayAleatoriosWrap(20,-50, 50);
		
		ArrayMetodos.mostrarArray(arrayInt);
		
		System.out.println(searchElement(arrayInt,25));
	}
}
