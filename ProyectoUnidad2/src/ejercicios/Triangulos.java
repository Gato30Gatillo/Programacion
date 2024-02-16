package ejercicios;
import java.util.Scanner;

public class Triangulos {
	public static void main(String [] args) {
		int Num1,Num2,Modu,Result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		Num1=sc.nextInt();
		System.out.println("introduce otro numero");
		Num2=sc.nextInt();
		Modu = Num1%Num2;
		Result=(Num2-Modu);
		System.out.println("hay que sumarle "+Result+" para que sea multiplo de "+Num2);
	}
}
