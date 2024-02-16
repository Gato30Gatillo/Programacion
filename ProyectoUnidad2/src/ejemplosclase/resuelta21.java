package ejemplosclase;

import java.util.Scanner;

/* Vamos a introducir por teclado un número (entero). Para distinguir si es par o 
 * impar comprobamos el resto de dividir por 2. */
public class resuelta21 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num; //número introducido por el usuario

      System.out.print("Introduzca un número: ");
      num = sc.nextInt();

      if ((num % 2 == 0)||(num%3==0)) { //si num es par o divisible por 3
         System.out.println("Es par o divisible por 3");
      } else { // es impar
         System.out.println("Es impar");
      }
   }
}


