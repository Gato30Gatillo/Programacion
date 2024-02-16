package dowhile;
import java.util.Scanner;

public class Ejercicio302 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int edad=0,suma=0,contadorMayorEdad=0,numAlumnos=0;
		double media=0;
		
		System.out.println("si introduces un numero negativo se acabara ");
		
		do {
			System.out.println("introduce la edad ");
			edad=sc.nextInt();
			if(edad>=0) {
			if(edad>=18) {
				contadorMayorEdad++;
			}
			suma=suma+edad;
			numAlumnos++;
			}
		}while(edad>=0);
		media=(double)suma/numAlumnos;
		System.out.println("hay un total de "+numAlumnos+" alumnos");
		System.out.println("la media de las edades es "+media);
		System.out.println("hay un total de "+contadorMayorEdad+" mayores de edad");
		System.out.println("la suma de todas las edades es "+suma);
		
	}
}