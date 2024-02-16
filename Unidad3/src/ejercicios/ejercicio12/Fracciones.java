package ejercicios.ejercicio12;

import java.util.Scanner;

public class Fracciones {

	private int numerador;
	private int denominador;
	
	

	public Fracciones(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public int getNumerador() {
		return numerador;
	}

	public int getDeominador() {
		return denominador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public void setDeominador(int deominador) {
		this.denominador = deominador;
	}
	
	public String leerfraccion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cual es el numerador?");
		numerador= sc.nextInt();
		System.out.println("¿Cual es el denominador?");
		denominador= sc.nextInt();
		return simplificarFraccion(numerador,denominador);
	}
	
	public String Escribirfraccion() {
		
		if(this.denominador!=1) {
			
		
		return numerador+"";
		}
		else {
			return numerador+"/"+denominador;
		}
	}
	
	
	static String simplificarFraccion(int numerador, int denominador) {
		double divisor = MCD(numerador, denominador);
		String fraccion = "/";
		fraccion = numerador / divisor + fraccion + denominador / divisor;
		return fraccion;
	}

	private static int MCD(int a, int b) {

		if (a == 0) {

			return a;

		} else {
			return MCD(b, a % b);
		}

	}
	
	
	
}