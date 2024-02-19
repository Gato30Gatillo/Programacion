package iesjandula.proyectounidad4.arrays;

import java.util.Locale;

public class ejercicio2 {
	
	
	public static void pintarArray(double[] lista) {
		
		for (int i=0; i<lista.length; i++) {
			if(i==0) {
				lista[i]=39;
			}
			else if(i==1){
				lista[i]=-2;
		}
			else if(i==4){
				lista[i]=0;
		}
			else if(i==6){
				lista[i]=14;
		}
			else if(i==8){
				lista[i]=5;
		}
			else if(i==9){
				lista[i]=120;
		}
			else{

		}
			System.out.format(Locale.ENGLISH, "|%6.2f|",lista[i]);

		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] lista=new double[11];
		
		pintarArray(lista);
		
		
	}


}
