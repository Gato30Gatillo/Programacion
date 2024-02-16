package ejercicios.Carlos;

import java.util.Scanner;

public class Ejercicio16CarlosConstantes2 {

    private static final double Precio_Paso1=0.8;
    private static final double PRECIO_Paso2=0.7;
    private static final double PRECIO_Paso3=0.6;
    private static final double PRECIO_Paso4=0.4;
    
    private static final int Corte1=4;
    private static final int Corte2=7;
    private static final int Corte3=9;
    
   public static void main(String[] args) {
       
        int min,minaux; 
        double precio=0.0;

    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca los minutos de llamada: ");
    min = sc.nextInt();
   
   
    if (min<=5) {
       
        precio = min *Precio_Paso1;
    }
    else if ( min <= 8) {
       
        precio = 5 * Precio_Paso1 + (min - Corte2) * PRECIO_Paso2;
       
       
    } else if (min <= 10) {
       
        precio = 5 * Precio_Paso1 + 3 * PRECIO_Paso2
                + (min - Corte2) * PRECIO_Paso3;
    } else {
       
        precio = 5 * Precio_Paso1 +
                3 * PRECIO_Paso2
                + 2 * PRECIO_Paso3
                + (min -Corte3)*PRECIO_Paso4;
    }
   
   
    System.out.println("El precio para " + min + " minutos es :" + precio);

   }

}