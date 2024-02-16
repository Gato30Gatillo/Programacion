package dowhile;
import java.util.Scanner;

public class Ejercicio304 {
	// alturas introducidas 12,15,8,10
	//etiqueta 				0, 1, 2, 3
	//la etiqueta la pongo yo con una variable tipo int
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numeroDeArbol=0,masAlto=numeroDeArbol;//el primer maximo es la primera etiqueta para dar una solución mas elegante
		double altura=0,mayorAltura=0;
		//se nos pide que al poner -1 se acabe el programa
		//se busca dar el arbol mas alto
		System.out.println("si introduces el numero -1 se acabara ");
		
		do {
			System.out.println("introduce la altura del arbol ");
			altura=sc.nextInt();
			if(altura>=0) {//no tiene sentido que la altura sea menor que 0
			if(mayorAltura<altura) {//si al altura es mayor que la altura maxima
				mayorAltura=altura;//la altura maxima se convierte en la altura actual
				masAlto=numeroDeArbol;
			}
			}numeroDeArbol++;//aumentamos el numero de arbol
			
		}while(altura!=-1);//si introducimos -1 se acaba
		System.out.println("el arbol mas grande es el "+masAlto+ " con una altura de "+mayorAltura+" cm" );	
	}
}