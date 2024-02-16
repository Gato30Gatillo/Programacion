package ejercicios.Carlos;

import java.util.Scanner;

public class Ejercicio16CarlosConstantes {

    private static final double PRECIO_CINCO_MIN=1;
    private static final double PRECIO_CINCO_OCHO_MIN=0.8;
    private static final double PRECIO_OCHO_DIEZ_MIN=0.7;
    private static final double PRECIO_DIEZ_MIN=0.6;
    
    private static final int Resta_cinco=5;
    private static final int Resta_ocho=8;
    private static final int Resta_diez=10;
    
   public static void main(String[] args) {
       
        int min,minaux; 
        double precio=0.0;

    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca los minutos de llamada: ");
    min = sc.nextInt();
   
   
    if (min<=5) {
       
        precio = min *PRECIO_CINCO_MIN;
    }
    else if ( min <= 8) {
       
        precio = 5 * PRECIO_CINCO_MIN + (min - Resta_cinco) * PRECIO_CINCO_OCHO_MIN;
       
       
    } else if (min <= 10) {
       
        precio = 5 * PRECIO_CINCO_MIN + 3 * PRECIO_CINCO_OCHO_MIN
                + (min - Resta_ocho) * PRECIO_OCHO_DIEZ_MIN;
    } else {
       
        precio = 5 * PRECIO_CINCO_MIN +
                3 * PRECIO_CINCO_OCHO_MIN
                + 2 * PRECIO_OCHO_DIEZ_MIN
                + (min -Resta_diez)*PRECIO_DIEZ_MIN;
    }
   
   
    System.out.println("El precio para " + min + " minutos es :" + precio);

   }

}