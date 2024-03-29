package ejercicios.ejercicio55;

public class Profesor extends EmpleadoEducacion{

	private String especialidad;
	private EnumProfesor cuerpo;
	private int Experiencia;
	
	public Profesor(String nombre, String apellidos, Long telefono, String direccion, double sueldo, double iRPF,
			int horario, String funciones, String especialidad, EnumProfesor cuerpo, int Experiencia) {
		super(nombre, apellidos, telefono, direccion, sueldo, iRPF, horario, funciones);
		// TODO Auto-generated constructor stub
		this.especialidad= especialidad;
		this.cuerpo=cuerpo;
		this.Experiencia=Experiencia;
	}
	
	
	public String getEspecialidad() {
		return especialidad;
	}


	public EnumProfesor getCuerpo() {
		return cuerpo;
	}


	public int getExperiencia() {
		return Experiencia;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	public void setCuerpo(EnumProfesor cuerpo) {
		this.cuerpo = cuerpo;
	}


	public void setExperiencia(int experiencia) {
		Experiencia = experiencia;
	}


	@Override
	public String toString() {
		return "Profesor [especialidad=" + especialidad + ", cuerpo=" + cuerpo + ", Experiencia=" + Experiencia
				+ ", toString()=" + super.toString() + "]";
	}


	@Override
	public double calculoDeSueldo() {
		// TODO Auto-generated method stub
		return this.getSueldo()-calculoDeImpuesto()+bonusDeExperiencia();
	}
	@Override
	public double calculoDeImpuesto() {
		// TODO Auto-generated method stub
		return (this.getSueldo()+bonusDeExperiencia())*this.getIRPF();
	}
	@Override
	public String funcion() {
		// TODO Auto-generated method stub
		return "Enseñar materia de"+especialidad;
	}
	
	private int bonusDeExperiencia() {
		return 20*this.Experiencia; 
	}
	
}
