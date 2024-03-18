package iesjandula.proyectunidad5.ejercicio45Extendido;

import java.util.InputMismatchException;
import java.util.Scanner;

import iesjandula.proyectunidad5.excepcionesapp.ErrorEntradaException;

public class EntradaDeDatos {

	private Scanner sc = null;
	public EntradaDeDatos() {
		
		
		sc = new Scanner(System.in);
		
	}
	
	public String leerString() throws ErrorEntradaException {
		
		try {
		return sc.next();
		} catch (InputMismatchException ime) {
			
			 throw new ErrorEntradaException("Error al leer numero decimal", ime);
			
		}
	}
	
	public double leerDouble() throws ErrorEntradaException {
		
		
		try {
			return sc.nextDouble();
			} catch (InputMismatchException ime) {
				
				 throw new ErrorEntradaException("error al leer numero entero",ime);
				
			}
		
	}
	
	public int leerEntero() throws ErrorEntradaException {
		
		
		try {
			return sc.nextInt();
			} catch (InputMismatchException ime) {
				
				 throw new ErrorEntradaException("error al ",ime);
				
			}
		
	}

	public void pulsarUnaTeclaParaContinuar() {
	System.out.println("pulsa enter para continuar........");
	sc.nextLine();
	}
	
	
}
