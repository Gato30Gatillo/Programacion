package ejercicios;

import java.util.Scanner;


public class Ejercicio6Carlos {

	public static void main(String[] args) {

		int x=7,y=9;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("introduce el valor de x");
		x = sc.nextInt();
		System.out.println("introduce el valor de y");
		y = sc.nextInt();
		if (x>0 && y>0){
		System.out.println("La coordenada ("+x+","+y+") Esta en el primer cuadrante");
		}
		else if (x==0 && y!=0){
			System.out.println("La coordenada ("+x+","+y+") Esta en el eje y");
		}
		else if (x!=0 && y==0){
			System.out.println("La coordenada ("+x+","+y+") Esta en el eje x");
		}
		else if (x<0 && y>0){
			System.out.println("La coordenada ("+x+","+y+") Esta en el segundo cuadrante");
		}
		else if (x<0 && y<0){
			System.out.println("La coordenada ("+x+","+y+") Esta en el tercer cuadrante");
		}
		else if (x>0 && y<0){
			System.out.println("La coordenada ("+x+","+y+") Esta en el cuarto cuadrante");
		}
		else {
			System.out.println("La coordenada ("+x+","+y+") Esta en el en el eje de coordenadas");
		}
	}
}
