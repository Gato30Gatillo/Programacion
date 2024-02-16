package ejercicios;
import java.util.Scanner;

public class tiempo {
	public static void main(String [] args) {
		int a,horas,minutos,segundos;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce el tiempo en segundos");
		a=sc.nextInt();
		horas = a/3600;
		a=a%3600;
		minutos= a/60;
		segundos=a&60;
		System.out.println(horas+"horas "+minutos+" minutos "+segundos+" segundos ");
	}
}
