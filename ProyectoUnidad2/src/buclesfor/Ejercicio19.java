package buclesfor;
import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {
		
		int n;
		int j=0;
		double acumulador=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("input a number ");
		n= sc.nextInt();
		for (double i=1;i<n;i++) {
			acumulador = acumulador + ( (1/i));
			if (i+1==n) {
				j++;
				System.out.println("A"+j+" = "+  (1/i));
			}
			else {
				j++;
				System.out.print("A"+j+" = "+  (1/i)+", ");
			}
		}
		System.out.println("the result is "+acumulador);

	}

}
