package iesjandula.proyectounidad4.arrays;



import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Random;

public class arrayTemperatura {

	public static void pintarArray(double[] array) {
		
		for (int i=0; i<3;i++) {
			if(i==2) {
				System.out.format(Locale.ENGLISH, "|%6.2f|",array[i]);
			}
			else {
			System.out.format(Locale.ENGLISH, "|%6.2f",array[i]);
		}
		}
		
	}
	
	public static void rellenarconUnos(double[] array) {
		for(int i=0; i<array.length;i++) {
			array[i]=1;
			System.out.print(array[i]+"|");
		}
		
		
	}
	
	
	public static void rellenarEntero(int x) {
		x=1;
	}
	
	
	
	public static int[] crearArrayConNumerosAleatorios(int tam) {
		
		int[]array=new int [tam];
		
		for(int i=0; i<tam;i++){
			Random rd=new Random();
			array[i]= (int) rd.nextInt(100);
			
			System.out.format(Locale.ENGLISH, "|%6.2f",array[i]);
		}
		
		return array;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] temperatura=new double[3];
		
		pintarArray(temperatura);
		System.out.println("");
		rellenarconUnos(temperatura);
		
		int z=0;
		
		rellenarEntero(z);
		
		System.out.print(crearArrayConNumerosAleatorios(5));
		
	}

}
