package ejercicios.ejercicio30Ingles;

public class Point {

	float x=0.0f;
	float y=0.0f;
	
	public Point() {
		
	}
	
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public float getXY() {
		array xy[];
		
	}

	public void setXY(float x,float y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	
	
}
