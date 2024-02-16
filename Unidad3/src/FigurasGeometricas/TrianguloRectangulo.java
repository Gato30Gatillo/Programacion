package FigurasGeometricas;

public class TrianguloRectangulo extends FiguraGeometrica {
	int base; 
	int altura;
	
	public TrianguloRectangulo() {
		this.tipoFigura=EnumFigura.Poligonos;
	}

	public TrianguloRectangulo(int base, int altura) {
		
		this();
		this.base = base;
		this.altura = altura;
		
	}

	@Override
	public double calcularArea() {
		return (base * altura / 2);
	}

	@Override
	public double calcularPerimetro() {
		return (base + altura + calcularHipotenusa()); 
	}


	double calcularHipotenusa() {
		return Math.pow(base * base + altura * altura, 0.5);
	}


	void determinarTipoTriángulo() {
		if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
			System.out.println("Es un triángulo equilátero"); 
		
		
		else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
			System.out.println("Es un triángulo escaleno");
		
		
		else
			System.out.println("Es un triángulo isósceles");
	}
}