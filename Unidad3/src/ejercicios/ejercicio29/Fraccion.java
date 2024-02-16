package ejercicios.ejercicio29;

public class Fraccion extends Numerica {
	private int numerador;
	private int denominador;
	
	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}
	public int getNumerador() {
		return numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	@Override
	public String toString() {
		return numerador+"/"+denominador;
	}
	
	@Override
	public Numerica sumar(Numerica numero) {
		
		Fraccion fparam =(Fraccion) numero;
		
		Fraccion resultado = new Fraccion(this.numerador+fparam.getNumerador(),
				this.numerador+ fparam.getDenominador());
		return null;
	}
	
	@Override
	public Numerica restar(Numerica numero) {
		Fraccion fparam =(Fraccion) numero;
		
		Fraccion resultado = new Fraccion(this.numerador-fparam.getNumerador(),
				this.numerador- fparam.getDenominador());
		return null;	}
	
	@Override
	public Numerica multiplicar(Numerica numero) {
		Fraccion fparam =(Fraccion) numero;
		
		Fraccion resultado = new Fraccion(this.numerador*fparam.getNumerador(),
				this.numerador* fparam.getDenominador());
		return null;	}
	
	@Override
	public Numerica dividir(Numerica numero) {
		
		Fraccion fparam =(Fraccion) numero;
		
		Fraccion resultado = new Fraccion(this.numerador/fparam.getNumerador(),
				this.numerador/ fparam.getDenominador());
		return null;
	}
	
	
}
