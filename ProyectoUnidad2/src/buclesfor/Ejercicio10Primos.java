package buclesfor;
import java.util.Scanner;

public class Ejercicio10Primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,contador=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un numero para saber si es primo ");
		n=sc.nextInt();
		
		for (int i=2;i<=n;i++) {
	
			if (n%i==0) {
				contador++;
			}
			else  {
			}
		}
		if(contador==1) {
			System.out.println(n+" es primo");
		}
		else {
			System.out.println(n+" no es primo");
		}
	}

}
