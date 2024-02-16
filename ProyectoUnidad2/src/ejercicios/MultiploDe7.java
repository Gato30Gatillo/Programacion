package ejercicios;
import java.util.Scanner;

public class MultiploDe7 {
	public static void main(String [] args) {
		int Num,Modu,Result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		Num=sc.nextInt();
		Modu = Num%7;
		Result=(7-Modu);
		System.out.println("hay que sumarle "+Result+" para que sea multiplo de 7");
	}
}
