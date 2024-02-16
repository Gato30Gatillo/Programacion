package buclesfor;
import java.util.Scanner;
public class EjercicioFactorial4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=0;
		int resultadoFactorial=1;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Escribe un numero entero para calcular el factorial");
		
		num= sc.nextInt();
		
		for (int i=1;i<=num;i++) {
			resultadoFactorial= resultadoFactorial*i;
			
		}
		System.out.println("el factorial de "+num+" es "+ resultadoFactorial);
	}

}
