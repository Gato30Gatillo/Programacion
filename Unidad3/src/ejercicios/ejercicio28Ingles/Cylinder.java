package ejercicios.ejercicio28Ingles;

public class Cylinder extends Circle{

	double height=1.0;
	
	Cylinder(){
		
	}
	
	Cylinder(double radius){
		super(radius);
	}
	
	Cylinder(double radius, double height){
		super(radius);
		this.radius = radius;
		}
	Cylinder(double height,double radius,String color){
		
		super(radius,color);
		this.height=height;
		
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double getArea() {
		return 2 * Math.PI * Math.pow(radius, 2) + radius * height * 2 * Math.PI;
	}
	
	public double getVolume() {
		return super.getArea()*this.height;
	}
	
}
