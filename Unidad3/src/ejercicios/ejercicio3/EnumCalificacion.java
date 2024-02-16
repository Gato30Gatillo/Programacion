package ejercicios.ejercicio3;

public enum EnumCalificacion {

	Muy_Mala("Muy mala",0,2),
	Mala("mala",0,2),
	Regular("Regular",0,2),
	Buena("Buena",0,2),
	Muy_Buena("Muy buena",8,10);
	
	private String descripcion;
	private int minCalification;
	private int maxCalification;
	
	EnumCalificacion(String descripcion, int minRange, int maxRange) {
		
		this.descripcion = descripcion;
		this.minCalification = minRange;
		this.maxCalification = maxRange;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public int getMinCalification() {
		return minCalification;
	}
	public int getMaxCalification() {
		return maxCalification;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setMinCalification(int minRange) {
		this.minCalification = minRange;
	}
	public void setMaxCalification(int maxRange) {
		this.maxCalification = maxRange;
	}
	
	
}
