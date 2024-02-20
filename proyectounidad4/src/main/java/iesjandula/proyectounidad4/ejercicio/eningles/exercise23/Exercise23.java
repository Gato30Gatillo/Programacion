package iesjandula.proyectounidad4.ejercicio.eningles.exercise23;

import iesjandula.proyectounidad4.ejemplosenclase.ArrayMetodos;

public class Exercise23 {

	public static String SecondSmaller(Integer[] arrayParam) {
		
		String cadena="The second smaller elements of the array is: ";
		Integer min= Integer.MAX_VALUE-1;
		Integer secondmin= Integer.MAX_VALUE;
		for (Integer item: arrayParam) {		
		
		if(min>item) {
			secondmin=min;
			min=item;
		}
		else if(item>min && secondmin>item) {
			secondmin=item;
		}
		
		
		}	
		return cadena +secondmin;
	}
	public static void main(String[] args) {
		
		
		Integer[] arrayInt= ArrayMetodos.rellenaArrayAleatoriosWrap(10,20,25);
		String cadena;
		ArrayMetodos.mostrarArray(arrayInt);
		
		cadena=SecondSmaller(arrayInt);
		
		System.out.println(cadena);
	}
}