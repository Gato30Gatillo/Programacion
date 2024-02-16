package ejemplosclase;
import java.util.Scanner;

import java.util.Random;

public class Ejercicio218 {
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			int resultado,intento;
			
			Random rand=new Random();
			int ran1=rand.nextInt(1,99);
			int ran2=rand.nextInt(1,99);
			double numeroRandomdouble=100*rand.nextDouble()-1;
			double numeroRandomdouble2=100*rand.nextDouble(1.0,99.0);
		
		System.out.println("cuanto es "+ran1+"+"+ran2);
		intento=sc.nextInt();
		resultado=ran1+ran2;
		if(resultado==intento) {
			System.out.println("hacertaste eres increible");

		}
		else {
			System.out.println("fallaste inutil");

		}
		}
}