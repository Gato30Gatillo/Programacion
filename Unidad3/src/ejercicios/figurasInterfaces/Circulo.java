package ejercicios.figurasInterfaces;

public class Circulo extends FiguraGeometrica {

	
	private int radio;
	static int circulosCreados;
	
	static {
		
		circulosCreados=0;
	}
	
	public Circulo() {
		
		this.tipoFigura=EnumFigura.Elipses;
		circulosCreados++;
	}
	
	public Circulo (int radio) {
		
		this();
		this.radio=radio;
		circulosCreados++;
		
	}
	public static int getrectangulosCreados() {
		return circulosCreados;
		
	}

	
	public int getradio() {
		return this.radio;
		
	}
	public void setradio(int radio) {
		this.radio=radio;
	}
	
	@Override
	public double calcularArea() {
		return Math.pow(radio, 2)*Math.PI;
	}
	@Override
	public double calcularPerimetro() {
		return radio*Math.PI*2;
	}
	
	@Override
	public String toString() {
        return "Circulo [radio=" + radio + "]";
    }

}
