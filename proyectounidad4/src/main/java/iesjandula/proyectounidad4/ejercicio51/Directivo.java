package iesjandula.proyectounidad4.ejercicio51;

public class Directivo extends Empleado {


	private int bonusPorcentaje;
	private double beneficiosDep;
	
	public Directivo(String nombre, String apellidos, String nif, int antiguedad, 
			double salario,int bonusPorcentaje, double beneficiosDep) {
		super(nombre, apellidos, nif, antiguedad, salario);
		// TODO Auto-generated constructor stub
		this.bonusPorcentaje=bonusPorcentaje;
		this.beneficiosDep=beneficiosDep;
	}
	
	
	
	public int getBonusPorcentaje() {
		return bonusPorcentaje;
	}



	public double getBeneficiosDep() {
		return beneficiosDep;
	}



	public void setBonusPorcentaje(int bonusPorcentaje) {
		this.bonusPorcentaje = bonusPorcentaje;
	}



	public void setBeneficiosDep(double beneficiosDep) {
		this.beneficiosDep = beneficiosDep;
	}



	@Override
	public EnumCategoria tipoEmpleado() {
		// TODO Auto-generated method stub
		return EnumCategoria.Directivo;
	}

	@Override
	public double calcularSueldo(double impuesto) {
		// TODO Auto-generated method stub
		double sueldoBruto=this.getSalario()+this.bonusPorcentaje*this.beneficiosDep;
		return sueldoBruto - this.calcularImpuestos(sueldoBruto, impuesto);
	}
	
	
	
	
}
