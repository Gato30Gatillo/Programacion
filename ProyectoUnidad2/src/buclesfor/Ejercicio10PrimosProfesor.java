package buclesfor;
import java.util.Scanner;

public class Ejercicio10PrimosProfesor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		boolean esPrimo=true;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un numero para saber si es primo ");
		n=sc.nextInt();
		
		for (int i=2;i<=n/2&&esPrimo==true;i++) {
	
			if (n%i==0) {
				esPrimo=false;
				//Break; es poco elegante
			}
			else  {
			}
		}
		if(esPrimo) {
			System.out.println("el numero "+n+" es primo");
		}
		else {
			System.out.println("el numero "+n+" no es primo");
		}
	}

}
