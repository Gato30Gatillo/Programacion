package iesjandula.proyectounidad4.arrays;

import java.util.Locale;

public class problema2 {

		
		
		public static void suma(double[] lista) {
			double suma=0;
			for (int i=0; i<lista.length; i++) {
				suma= suma+lista[i];

			}
			System.out.println(suma);
		}
		
		public static void average(double[] lista) {
			double suma=0;
			for (int i=0; i<lista.length; i++) {
				suma= suma+lista[i];

			}
			System.out.println(suma/lista.length);
		}
		
		public static <T extends Number> double average(T[] array) {
			double average=0.0;
			for(int i=0; i<array.length; i++) {
				average+= array[i].doubleValue();
			}
			return average/array.length;
		}
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			double[] array={1,3,5,7};
			
			Integer[] array2= {1,2,3,4,5};
			
			suma(array);
			average(array);
			
			float[] array3= {1.2f,2.6f,3.0f,4.4f,5.7f};
			
		}


	}

