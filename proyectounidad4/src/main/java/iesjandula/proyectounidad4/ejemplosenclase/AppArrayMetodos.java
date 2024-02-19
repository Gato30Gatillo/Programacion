package iesjandula.proyectounidad4.ejemplosenclase;

public class AppArrayMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayInteger = ArrayMetodos.rellenaArrayAleatorios(20, 50);
		
		ArrayMetodos.mostrarArray(arrayInteger);
		
		arrayInteger=ArrayMetodos.revierteArray(arrayInteger);
		
		ArrayMetodos.mostrarArray(arrayInteger);
		
		Double[] arrayWrapDouble=ArrayMetodos.rellenaArrayAleatoriosWrap(20, 55.0);
		Double[] arrayWrapDouble2=ArrayMetodos.rellenaArrayAleatoriosWrap(20, 55.0);
		
		ArrayMetodos.mostrarArray(arrayWrapDouble);
		
		ArrayMetodos.revierteArray(arrayWrapDouble);
		
		ArrayMetodos.mostrarArray(arrayWrapDouble);
		
		Double max= ArrayMetodos.maxInArray(arrayWrapDouble);
		
		System.out.println(max);
		
		Double min= ArrayMetodos.minInArray(arrayWrapDouble);
		
		System.out.println(min);
		
		String[]concadenados=ArrayMetodos.combinaArrays(arrayWrapDouble, arrayWrapDouble2);
		
		ArrayMetodos.mostrarArray(concadenados);
		
	}

}
