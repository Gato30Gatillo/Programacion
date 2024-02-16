package ejerciciosprofe;
import java.util.Scanner;

public class mostrarPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce el numero hasta que hay que mostrar pares");
		n=sc.nextInt();
		
		for (int i=n;i>=0;i--) {
									
			if (i%2==0&&i-2>=0) {
				System.out.print(i+",");
			}
			if (i%2==0&&i-2<0) {
				System.out.print(i);
			}
		}
	}

}
