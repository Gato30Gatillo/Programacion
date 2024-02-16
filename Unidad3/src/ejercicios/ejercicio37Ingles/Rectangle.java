package ejercicios.ejercicio37Ingles;

public class Rectangle implements GeometricObject{
	
	private double width;
	private double lenght;
	
	public Rectangle() {
	}
	
	public Rectangle(double width, double lenght) {
		super();
		this.width = width;
		this.lenght = lenght;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLenght() {
		return lenght;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", lenght=" + lenght + "]";
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*lenght;
	}
	
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (width*2)+(lenght*2);
	}
	
}
