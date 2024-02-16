package ejemplosclase;

import java.util.Scanner;

public class EjemploSwitchSencillo {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("introduce un numero");
			num=sc.nextInt();
			
			switch(num) {
			case 1: 
				System.out.println("has introducido el 1");
				break;
			case 2: 
				System.out.println("has introducido el 2");
				break;
				
			default: 
				System.out.println("has introducido otro numero distinto de 1 y 2");
			}
		
	}
}