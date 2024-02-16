package ejercicios;
import java.util.Scanner;

public class JavaSumaNumeros {
	public static void main(String [] args) {
		int Can1, Can2,Sum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce Can1");
		Can1=sc.nextInt();
		
		System.out.println("introduce Can2");
		Can2=sc.nextInt();
		
		Sum=Can1+Can2;
		System.out.println("la suma es " + Sum);
	}
}