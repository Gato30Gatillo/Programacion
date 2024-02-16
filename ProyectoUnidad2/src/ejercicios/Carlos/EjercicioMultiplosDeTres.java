package ejercicios.Carlos;
import java.util.Scanner;
public class EjercicioMultiplosDeTres {

	
	//el programa va a coger un numero n por pantalla
	//y va a mostrar desde n hasta 3 todos los multiplos de 3
	
	//normal condecremento1
	//pensando como mejorar
	//pro
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		int n=0;
		
		System.out.println("introduce el numero desde el que se mostraran los multiplos de 3");
		n=sc.nextInt();	
		if(n<3) {
			System.out.println("no es posible");
		}
		for (int i=n-(n%3);i>=3;i=i-3) {
			if(i%3==0) {
				System.out.println(i+" es multiplo de 3");
		}
	}
	}
}