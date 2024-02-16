package ejerciciosprofe;
import java.util.Scanner;

public class EjercicioCarlos4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n,i=1,resultado=1;
		System.out.println("Introduce un numero");
		n=sc.nextInt();
		while(i<=n) {
			resultado=resultado*i;
			System.out.println(resultado);

					i++;
		}
		System.out.println(n+"! = "+resultado);

	}

}
