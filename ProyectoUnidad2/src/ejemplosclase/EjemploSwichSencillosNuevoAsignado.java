package ejemplosclase;

import java.util.Scanner;

public class EjemploSwichSencillosNuevoAsignado {

	public static void main(String[] args) {
		int num,resultado;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("introduce un numero");
			num=sc.nextInt();
			resultado = switch (num) {
			case 1 -> num+1;
			
			case 2->{	System.out.println("has introducido el 2");
				
			System.out.println("Aqui si hacen faltas llaves");
				yield num+2;
			
			}
			
			default -> 7;
			
			};
		
	}
}