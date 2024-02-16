package ejercicios.figurasInterfaces;

public class Rectangulo extends FiguraGeometrica{

	private int base;
	private int altura;
	
	private static int rectangulosCreados;
	
	static {
		
		rectangulosCreados=0;
	}
	
	public Rectangulo() {
		this.tipoFigura=EnumFigura.Poligonos;
		rectangulosCreados++;
	}
	
	public Rectangulo (int base,int altura) {
		this();
		this.base=base;
		this.altura=altura;
		rectangulosCreados++;
	}
	public static int getrectangulosCreados() {
		return rectangulosCreados;
		
	}

	
	public int getbase() {
		return this.base;
		
	}
	public void setbase(int base) {
		this.base=base;
	}
	public int getaltura() {
		return this.altura;
		
	}
	public void setaltura(int altura) {
		this.altura=altura;
	}
	
	@Override
	public double calcularArea() {
		return base*altura;
		
	}

	@Override
	public double calcularPerimetro() {
		return base*2+altura*2;
		
	}

	
	@Override
	public String toString() {
        return "Persona [base=" + base + ", altura = " + altura +"]";
    }
	
}
