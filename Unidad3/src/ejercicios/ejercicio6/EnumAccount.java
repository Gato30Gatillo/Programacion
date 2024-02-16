package ejercicios.ejercicio6;

public enum EnumAccount {
		Check("checking accounts"),
		Saving("saving accounts"),
		CD("Certificate of deposit accounts");
	
	private String descripcion;

	private EnumAccount(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
