package iesjandula.proyectounidad4.ejercicio51;

public class Subdirectivo extends Empleado {

	
	private double porcentajeAntiguedad;
	private double primAnual;
	
	public Subdirectivo(String nombre, String apellidos, String nif, int antiguedad, 
			double salario, double porcentajeAntiguedad, double primAnual) {
		super(nombre, apellidos, nif, antiguedad, salario);
		// TODO Auto-generated constructor stub
		this.porcentajeAntiguedad=porcentajeAntiguedad;
		this.primAnual= primAnual;
	}

	public double getPorcentajeAntiguedad() {
		return porcentajeAntiguedad;
	}

	public double getPrimAnual() {
		return primAnual;
	}

	public void setPorcentajeAntiguedad(double porcentajeAntiguedad) {
		this.porcentajeAntiguedad = porcentajeAntiguedad;
	}

	public void setPrimAnual(double primAnual) {
		this.primAnual = primAnual;
	}

	@Override
	public String toString() {
		return "Subdirectivo [porcentajeAntiguedad=" + porcentajeAntiguedad + ", primAnual=" + primAnual
				+ ", getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getNif()=" + getNif()
				+ ", getAntiguedad()=" + getAntiguedad() + ", getSalario()=" + getSalario() + "]";
	}

	@Override
	public EnumCategoria tipoEmpleado() {
		// TODO Auto-generated method stub
		return EnumCategoria.Subdirectivo;
	}

	@Override
	public double calcularSueldo(double impuesto) {
		// TODO Auto-generated method stub
		double sueldoBruto=this.getSalario()+ this.getPorcentajeAntiguedad() * this.getAntiguedad()*this.getPrimAnual();
		return sueldoBruto - this.calcularImpuestos(sueldoBruto, impuesto);
	}
	
	
}
