package ejercicios.figurasInterfaces;

public class PentagonoRegular extends FiguraGeometrica {

	private double lado=0.0;
	
	public PentagonoRegular() {
		this.tipoFigura=EnumFigura.Poligonos;
	}
	
	public PentagonoRegular(double lado) {
		this();
		this.lado = lado;
	}


	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getApotema() {
		return calcularApotema();
	}

	private double calcularApotema() {
		return lado/(2*Math.tan(1.0/5)*Math.PI);
	}
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return calcularPerimetro()* getApotema() /2;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 5*lado;
	}

}
