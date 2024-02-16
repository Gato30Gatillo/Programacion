package ejercicios;
import java.util.Scanner;

public class importe {
	public static void main(String [] args) {
		int infantil,adultos;
		double dinerototal,total;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce el numero de entradas infantiles");
		infantil=sc.nextInt();
		System.out.println("introduce el numero de entradas de adultos");
		adultos=sc.nextInt();
		dinerototal= infantil*15.5+adultos*20;
		total= dinerototal<120? dinerototal:dinerototal-(dinerototal*0.05);
		System.out.println("el importe es de "+total+" euros");
	}
}
