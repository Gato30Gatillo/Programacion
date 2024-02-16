package ejerciciosprofe;
import java.util.Scanner;

public class EjercicioCarlos2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n,i=1;
		
		System.out.println("Introduce un numero");
		n=sc.nextInt();
	
	while(i<n) {
		System.out.println("vuelta "+i);
		i++;

	}
	System.out.println("vuelta "+n);
}
}