package ejemplosclase;

import java.util.Scanner;

public class EjercicioSwitchTradicional {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("introduce un numero del 1 al 7");
			num=sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("es lunes");
				break;
			case 2:
				System.out.println("es martes");
				break;
			case 3:
				System.out.println("es miércoles");
				break;
			case 4:
				System.out.println("es jueves");
				break;
			case 5:
				System.out.println("es viernes");
				break;
			case 6:
				System.out.println("es sabado");
				break;
			case 7:
				System.out.println("es domingo");
				break;
			default: 
			System.out.println("has introducido un numero que no esta entre 1 y 7");

			}
		
	}
}