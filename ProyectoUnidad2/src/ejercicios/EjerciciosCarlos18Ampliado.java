package ejercicios;

import java.util.Scanner;

public class EjerciciosCarlos18Ampliado {

	public static void main(String[] args) {
		int grados, kelvin, fahrenheit,opcion;		
		Scanner sc = new Scanner(System.in);
			System.out.println("¿Quieres introducir grados: 1 kelvin, 2 fahrenheit o 3 celcius? ");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1-> {
				System.out.println("Introduce los grados ");
				kelvin = sc.nextInt();
				System.out.println("¿Quieres pasar a grados: 1 fahrenheit o 2 celcius? ");
				opcion = sc.nextInt();
				switch (opcion) {
				case 1-> {
					fahrenheit= (kelvin-273)*5/9+32;
					System.out.println(kelvin+" Grados kelvin equivalen a "+fahrenheit+"fahrenheit");

				}
				case 2->{
					grados=kelvin-273;
					System.out.println(kelvin+" Grados kelvin equivalen a "+grados+"centigrados");

				}
			}
			}
			case 2-> {
				System.out.println("Introduce los grados ");
				fahrenheit = sc.nextInt();
				System.out.println("¿Quieres pasar a grados: 1 kelvin o 2 celcius? ");
				opcion = sc.nextInt();
				switch (opcion) {
				case 1-> {
					kelvin=(fahrenheit-32)*5/9+273;
					System.out.println(fahrenheit+" Grados fahrenheit equivalen a "+kelvin+" kelvin");

				}
				case 2->{
					grados=(fahrenheit-32)*5/9;
					System.out.println(fahrenheit+" Grados fahrenheit equivalen a "+grados+" centigrados");

				}
			}
			}
			case 3 ->{
				System.out.println("Introduce los grados ");
				grados = sc.nextInt();
				System.out.println("¿Quieres pasar a grados: 1 fahrenheit o 2 kelvin? ");
				opcion = sc.nextInt();
				switch (opcion) {
				case 1-> {
					fahrenheit = (grados*9/5)+32;
					System.out.println(grados+" Grados celcius equivalen a "+fahrenheit+"fahrenheit");
				}
				case 2->{
					kelvin = grados+273;
					System.out.println(grados+" Grados celcius equivalen a "+kelvin+"kelvin");
				}
				
			}
			}
	}
}
}