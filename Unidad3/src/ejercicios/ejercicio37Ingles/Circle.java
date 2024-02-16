package ejercicios.ejercicio37Ingles;

public class Circle implements GeometricObject{

	private double radius;

	public Circle() {
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(radius, 2)*Math.PI;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return radius*Math.PI*2;
	}
	
}
