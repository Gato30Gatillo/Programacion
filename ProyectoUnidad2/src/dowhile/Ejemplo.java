package dowhile;
import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int cont =11;
		do {
			System.out.println("vuelta "+cont);
			cont++;
		}while(cont<10);
		}
}