package buclesejemplosclase;

public class BuclesEjemploClase {
	public static void main(String args[]) {
			
		int i=0,s=0,max=i,min=i;
		
		while(i<10) {
			System.out.println("El valor del contador del contador es "+i);
			s+=i;
			i++;
			
			if (i>max) {
				max=i;
			}
			if (i<min) {
				min=i;
			}
			//i=i+1
		}
		System.out.println("la suma de los numeros de 0 a "+(i-1)+" es "+s);
		System.out.println("El maximo es "+max);
		System.out.println("El minimo es "+min);

	
	}
}
