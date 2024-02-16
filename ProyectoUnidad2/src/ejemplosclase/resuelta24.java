package ejemplosclase;

import java.util.Locale;
import java.util.Scanner;

public class resuelta24 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      sc.useLocale(Locale.US); 

	      System.out.print("Introduzca un número real positivo o negativo: ");
	      double num = sc.nextDouble();
	      if ((num>0) && (num < 1)) {
	         System.out.println("Es un número casi-cero positivo");
	      } 
	      else 	if ((num<0) && (num > -1)) {
	      			System.out.println("Es un número casi-cero negativo");
	      		} 
	      		else 	if (num==0){
	         System.out.println("el numero es cero");
	      				}
	      				else {
	   	         System.out.println("No es un casi-cero");
	      				}
	}
}