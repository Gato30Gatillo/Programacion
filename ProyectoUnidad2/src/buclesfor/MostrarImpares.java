package buclesfor;
import java.util.Scanner;

public class MostrarImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce el numero hasta que hay que mostrar impares");
		n=sc.nextInt();
		
		for (int i=1;i<=n;i++) {
									
			if (i%2==1&&i+2<n) {
				System.out.print(i+",");
			}
			if (i%2==1&&i+2>n) {
				System.out.print(i);
			}
		}
	}

}
