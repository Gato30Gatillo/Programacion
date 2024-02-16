package ejemplosclase;
import java.util.Scanner;
public class NumeroLetra {
		public static void main(String[] args) {

			int num1,uni,dece;
			String unidades="",
					decenas="",
					resultado="";
			Scanner sc = new Scanner (System.in);
			
			System.out.println("introduce un numero entre 0 y 99");
			num1= sc.nextInt();
			
			uni=num1%10;
			dece=num1/10;
			
			if (dece==0) {
			unidades = switch (uni) {
					
					case 0-> "cero";
					case 1-> "uno";
					case 2-> "dos";
					case 3-> "tres";
					case 4-> "cuatro";
					case 5-> "cinco";
					case 6-> "seis";
					case 7-> "siete";
					case 8-> "ocho";
					case 9-> "nueve";
					default->"";
					};
			System.out.println("tu numero es "+unidades);

			}
			else {
				unidades = switch (uni) {
				
				case 1-> "uno";
				case 2-> "dos";
				case 3-> "tres";
				case 4-> "cuatro";
				case 5-> "cinco";
				case 6-> "seis";
				case 7-> "siete";
				case 8-> "ocho";
				case 9-> "nueve";
				case 0 -> "cero";
				default->"";
				};
				decenas = switch (dece) {
				
				case 1-> "diez";
				case 2-> "veinti";
				case 3-> "treinta";
				case 4-> "cuarenta";
				case 5-> "cincuenta";
				case 6-> "sesenta";
				case 7-> "setenta";
				case 8-> "ochenta";
				case 9-> "noventa";
				default->"";
				};
				if(uni==0){
					System.out.println("tu numero es "+decenas);
				}
				else {
				resultado= decenas+" y "+unidades;
				System.out.println("tu numero es "+resultado);
				}
			}
					
}
}