package ejercicios;
import java.util.Scanner;

public class patas {
	public static void main(String [] args) {
		int hormigas,aranas,cochinillas,total;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce el numero de hormigas");
		hormigas=sc.nextInt();
		System.out.println("introduce el numero de arañas");
		aranas=sc.nextInt();
		System.out.println("introduce el numero de cochinillas");
		cochinillas=sc.nextInt();
		total= hormigas*6+aranas*8+cochinillas*14;
		System.out.println("el numero total de patas es de "+total);
	}
}
