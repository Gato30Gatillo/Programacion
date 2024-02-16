package ejemplosclase;

import java.util.Scanner;

public class EjemploSwitchSencilloNuevo {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("introduce un numero");
			num=sc.nextInt();
			
			switch(num) {
			case 1 -> 
				System.out.println("has introducido el 1");
			case 2->{
				System.out.println("has introducido el 2");
				
				System.out.println("Aqui si hace falta las llaves");

			}
			default-> System.out.println("has introducido otro numero distinto de 1 y 2");

			}
		
	}
}