package ejercicios.ejercicio28Ingles;

public class AppCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle cir= new Circle(4,"Blue");
		
		Cylinder cil= new Cylinder(4,8,"Red");
		
		
		System.out.println(cir.getArea());
		System.out.println(cil.getArea());
		System.out.println(cil.getVolume());
	}

}
