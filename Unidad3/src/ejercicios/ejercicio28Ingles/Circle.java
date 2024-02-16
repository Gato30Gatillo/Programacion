package ejercicios.ejercicio28Ingles;

public class Circle {

	double radius=1.0;
	String color="red";
	
	Circle(){
		
	}
	public Circle(double radius) {
		this.radius=radius;
	}

	public Circle(double radius, String color) {

		this.radius = radius;
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	
}
