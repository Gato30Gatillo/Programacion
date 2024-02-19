package iesjandula.proyectounidad4.ejercicio.eningles.exercise24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import iesjandula.proyectounidad4.ejemplosenclase.ArrayMetodos;
import iesjandula.proyectounidad4.ejercicio.eningles.exercise16_17.Exercise16_17;

class Exercise24Test {

	@Test
	void evenArrayTest() {
		
		Integer[] arrayInit = ArrayMetodos.rellenaArrayAleatoriosWrap(20,-50, 50);
		Integer[] arrayInit2 = ArrayMetodos.rellenaArrayAleatoriosWrap(20,-50, 50);
		
		Integer[] arrayTest = exercise24.evenArray(arrayInit,arrayInit2);
		
		for(Integer item: arrayTest) {
			assertNotNull(item);
			
			assertTrue(item%2==0,"Item tiene que ser par");
		}
	}
	
	@Test
	void oddArrayTest() {
		
		Integer[] arrayInit = ArrayMetodos.rellenaArrayAleatoriosWrap(20,-50, 50);
		Integer[] arrayInit2 = ArrayMetodos.rellenaArrayAleatoriosWrap(20,-50, 50);
		
		Integer[] arrayTest = exercise24.OddArray(arrayInit,arrayInit2);
		
		for(Integer item: arrayTest) {
			assertNotNull(item);
			
			assertTrue(item%2==0,"Item tiene que ser par");
		}
	}

}
