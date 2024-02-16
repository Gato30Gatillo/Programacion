package FigurasGeometricas;

public class Cuadrado extends FiguraGeometrica{

	
	private int lado;
	private static int cuadradosCreados;
	
	static {
		
		cuadradosCreados=0;
	}
	
	public Cuadrado() {
		this.tipoFigura=EnumFigura.Poligonos;
		cuadradosCreados++;
	}
	
	public Cuadrado (int lado) {
		this();
		this.lado=lado;
		cuadradosCreados++;
	}

	public static int getcuadradosCreados() {
		return cuadradosCreados;
		
	}

	

	public int getlado() {
		return this.lado;
		
	}
	public void setlado(int lado) {
		this.lado=lado;
	}
	
	@Override
	public double calcularArea() {
		return lado*lado;
	}
	
	@Override
	public double calcularPerimetro() {
		return lado*4;
	}
	
	@Override
	public String toString() {
        return "cuadrado [lado=" + lado + "]";
    }
	
}
