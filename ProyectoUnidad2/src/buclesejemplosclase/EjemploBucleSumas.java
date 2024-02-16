package buclesejemplosclase;
import java.util.Scanner;
public class EjemploBucleSumas {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		int i=0,num=0,sum=0;
		System.out.println("Introduce un numero distinto de cero para iniciar");
		num=sc.nextInt();
		
		int max=num;
		int min=num;
		System.out.println("Si el numero es cero acaba el programa ");
		
		while(num!=0) {
			sum=sum+num;
			if (max<num) {
				max=num;
			}
			if (min>num) {
				min=num;
			}
			System.out.println("introduce otro numero");
			num=sc.nextInt();
		}
		System.out.println("la suma de los numeros es "+sum);
		System.out.println("el maximo es "+max);
		System.out.println("el minimo es "+min);


	
	}
}
