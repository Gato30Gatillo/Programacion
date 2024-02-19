package iesjandula.proyectounidad4.arrays;

import java.util.Locale;

public class ejercicio3 {
	
	
	public static void pintarArray(String[] lista) {
		
		for (int i=0; i<lista.length; i++) {
			if(i==0) {
				lista[i]="a";
			}
			else if(i==1){
				lista[i]="x";
		}
			else if(i==4){
				lista[i]="@";
		}
			else if(i==6){
				lista[i]="";
		}
			else if(i==7){
				lista[i]="+";
		}
			else if(i==8){
				lista[i]="-";
		}
			else{

		}
			System.out.format(Locale.ENGLISH, "|%6.2f|",lista[i]);

		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] lista=new String[11];
		
		pintarArray(lista);
		
		
	}


}
