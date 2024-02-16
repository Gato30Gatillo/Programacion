package ejerciciosprofe;

import java.util.Scanner;

public class Ejercicio7Reves {
	public static void main(String[] args) {

	int n,num=0,aux,sumaTotal=0;
	String cadena="";
	Scanner sc = new Scanner(System.in);
	System.out.println("selecciona el numero que pasar a binario ");
	n= sc.nextInt();
	while(n!=0) {
		aux=n%2;
		n=n/2;
		cadena=aux+cadena;
	}
	System.out.print(cadena);
	
	//cadena=cadena+aux;
	//String c=cadena;
	//StringBuilder input1 = new StringBuilder(c);
	//String crevertido = input1.reverse().toString();
	//System.out.print(crevertido);

}
}
