package iesjandula.proyectounidad4.ejercicio.eningles.exercise16_17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import iesjandula.proyectounidad4.ejemplosenclase.ArrayMetodos;

class Exercise16_17Test {


	@Test
	void returnArrayWithPositivesTest() {
	
		Integer[] arrayInit = ArrayMetodos.rellenaArrayAleatoriosWrap(20,-50, 50);
		
		Integer[] arrayTest = Exercise16_17.returnArrayWithPositives(arrayInit);
		
		for(Integer item: arrayTest) {
			assertNotNull(item);
			
			assertTrue(item>0,"Item tiene que ser positivo");
		}
	}
	
	@Test
	void returnArrayWithNegativesTest() {
	
		Integer[] arrayInit = ArrayMetodos.rellenaArrayAleatoriosWrap(20,-50, 50);
		
		Integer[] arrayTest = Exercise16_17.returnArrayWithNegatives(arrayInit);
		
		for(Integer item: arrayTest) {
			assertNotNull(item);
			
			assertTrue(item<0,"Item tiene que ser negativo");
		}
	}
	
}
