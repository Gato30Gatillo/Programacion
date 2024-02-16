package dowhile;
import java.util.Scanner;
		
public class EjercicioRefuerzo3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int numCoches=0;
		double media=0,
				precioCoche=0,
				precioMaximo=0,
				precioMinimo=Double.MAX_VALUE;
		String modeloCoche="",
				modeloMaximo="",
				modeloMinimo="",
				curso="";
		
		System.out.println("Si introduces el precio 0 se acaba ");
		
		do {
			System.out.println("introduce el precio del coche ");
			precioCoche=sc.nextDouble();
			
			if(precioCoche!=0) {
				System.out.println("introduce el modelo del coche ");
				modeloCoche=sc.next();
					
			if(precioMaximo<=precioCoche) {
				precioMaximo=precioCoche;
				modeloMaximo=modeloCoche;
			}
			
			if(precioMinimo>=precioCoche) {
				precioMinimo=precioCoche;
				modeloMinimo=modeloCoche;
			}
			
			media=media+precioCoche;
			numCoches++;
			}
			
		}while(precioCoche!=0);
		
		if (numCoches>0) {
		media= media/numCoches;
		System.out.println("El modelo del coche mas caro es: "+modeloMaximo+" y su precio es de:"+precioMaximo+ "$");
		System.out.println("El modelo del coche mas barato es: "+modeloMinimo+" y su precio es de:"+precioMinimo+"$");
		System.out.println("el precio medio es de: "+media);
	}
}
}	