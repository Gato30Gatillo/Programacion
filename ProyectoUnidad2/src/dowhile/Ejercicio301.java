package dowhile;
import java.util.Scanner;

public class Ejercicio301 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num=0,cuadrado;
		
		System.out.println("si introduces el numero 0 se acabara ");
		
		do {
			System.out.println("introduce un numero ");
			num=sc.nextInt();
			if(num!=0){
			if(num%2==0) {
				System.out.println("es par");
			}
			else {
				System.out.println("es impar");
			}
			if(num<=0) {
				System.out.println("es negativo");
			}
			else {
				System.out.println("es positivo");
			}
			cuadrado = num*num;//Math.pow(num,2)
			System.out.println("su cuadrado es "+cuadrado);
			}
		}while(num!=0);
	}
}