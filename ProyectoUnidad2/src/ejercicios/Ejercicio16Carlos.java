package ejercicios;

import java.util.Scanner;


public class Ejercicio16Carlos {

	public static void main(String[] args) {

		double tiempo,precio,impuestos,pago;
		boolean mañana,domingo;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el tiempo que has estado hablando en minutos");
		tiempo = sc.nextInt();
		System.out.println("¿era domingo?");
		domingo = sc.nextBoolean();
		System.out.println("¿era por la mañana?");
		mañana = sc.nextBoolean();
		
		if (tiempo<=5){
			precio=1*tiempo;
			if (domingo==true) {
			impuestos=3;
			pago= precio+(precio*impuestos/100);
			System.out.println("el precio total de la llamada es de "+pago);
			}
			else if (mañana ==true) {
			impuestos=15;
			pago= precio+(precio*impuestos/100);
			System.out.println("el precio total de la llamada es de "+pago);
			}
			else {
				impuestos = 10;
				pago= precio+(precio*impuestos/100);
				System.out.println("el precio total de la llamada es de "+pago);
			}
		}
		else if (tiempo>=5&&tiempo<=8){
			precio=5+ 0.8*(tiempo-5);
			if (domingo==true) {
				impuestos=3;
				pago= precio+(precio*impuestos/100);
				System.out.println("el precio total de la llamada es de "+pago);
				}
				else if (mañana ==true) {
				impuestos=15;
				pago= precio+(precio*impuestos/100);
				System.out.println("el precio total de la llamada es de "+pago);
				}
				else {
					impuestos = 10;
					pago= precio+(precio*impuestos/100);
					System.out.println("el precio total de la llamada es de "+pago);
				}
		}
		else if (tiempo>=8&&tiempo<=10){
			precio=7.4+0.7*(tiempo-8);
			if (domingo==true) {
				impuestos=3;
				pago= precio+(precio*impuestos/100);
				System.out.println("el precio total de la llamada es de "+pago);
				}
				else if (mañana ==true) {
				impuestos=15;
				pago= precio+(precio*impuestos/100);
				System.out.println("el precio total de la llamada es de "+pago);
				}
				else {
					impuestos = 10;
					pago= precio+(precio*impuestos/100);
					System.out.println("el precio total de la llamada es de "+pago);
				}
		}
		else if (tiempo>10){
			precio=8.8+((tiempo-10)*0.5);
			if (domingo==true) {
				impuestos=3;
				pago= precio+(precio*impuestos/100);
				System.out.println("el precio total de la llamada es de "+pago);
				}
				else if (mañana ==true) {
				impuestos=15;
				pago= precio+(precio*impuestos/100);
				System.out.println("el precio total de la llamada es de "+pago);
				}
				else {
					impuestos = 10;
					pago= precio+(precio*impuestos/100);
					System.out.println("el precio total de la llamada es de "+pago);
				}		
			}
	}
}
