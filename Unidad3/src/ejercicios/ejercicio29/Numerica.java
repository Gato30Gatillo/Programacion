package ejercicios.ejercicio29;

public abstract class Numerica {


	public Numerica() {
	}
	
	public abstract String toString(); 
	
	public abstract Numerica sumar(Numerica numero);
	
	public abstract Numerica restar(Numerica numero);
	
	public abstract Numerica multiplicar(Numerica numero);

	public abstract Numerica dividir(Numerica numero);
	
}
