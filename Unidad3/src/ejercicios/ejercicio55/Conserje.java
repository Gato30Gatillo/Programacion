package ejercicios.ejercicio55;

public class Conserje extends EmpleadoEducacion{

	private int horarioCon;
	private EnumConserge posicion;
	
	public Conserje(String nombre, String apellidos, Long telefono, String direccion, double sueldo, double iRPF,
			int horario, String funciones, int horarioCon,EnumConserge posicion) {
		super(nombre, apellidos, telefono, direccion, sueldo, iRPF, horario, funciones);
		
		this.horarioCon=horarioCon;
		this.posicion=posicion;
	}
	

	public int getHorarioCon() {
		return horarioCon;
	}


	public EnumConserge getPosicion() {
		return posicion;
	}


	public void setHorarioCon(int horarioCon) {
		this.horarioCon = horarioCon;
	}


	public void setPosicion(EnumConserge posicion) {
		this.posicion = posicion;
	}


	@Override
	public String toString() {
		return "Conserje [horarioCon=" + horarioCon + ", posicion=" + posicion + ", toString()=" + super.toString()
				+ "]";
	}


	@Override
	public double calculoDeSueldo() {
		// TODO Auto-generated method stub
		return this.getSueldo() - calculoDeImpuesto();
	}

	@Override
	public double calculoDeImpuesto() {
		// TODO Auto-generated method stub
		return this.getSueldo() * this.getIRPF();
	}

	@Override
	public String funcion() {
		// TODO Auto-generated method stub
		return "realizar labores de atencion al publico y mantenimiento";
	}

}
