package ejercicios.ejercicio55;

public class Administrativos extends EmpleadoEducacion {

	private EnumPerfilAdministrativo perfil;
	private EnumClaseAdministrativo clase;
	
	public Administrativos(String nombre, String apellidos, Long telefono, String direccion, double sueldo, double iRPF,
			int horario, String funciones,EnumPerfilAdministrativo perfil,EnumClaseAdministrativo clase) {
		super(nombre, apellidos, telefono, direccion, sueldo, iRPF, horario, funciones);
		// TODO Auto-generated constructor stub
		this.perfil=perfil;
		this.clase=clase;
	}
	

	public EnumPerfilAdministrativo getPerfil() {
		return perfil;
	}


	public EnumClaseAdministrativo getClase() {
		return clase;
	}


	public void setPerfil(EnumPerfilAdministrativo perfil) {
		this.perfil = perfil;
	}


	public void setClase(EnumClaseAdministrativo clase) {
		this.clase = clase;
	}


	@Override
	public double calculoDeSueldo() {
		// TODO Auto-generated method stub
		return this.getSueldo()-calculoDeImpuesto()+categoriaBonus();
	}

	@Override
	public double calculoDeImpuesto() {
		// TODO Auto-generated method stub
		return (this.getSueldo()+categoriaBonus()*this.getIRPF());
	}

	@Override
	public String funcion() {
		// TODO Auto-generated method stub
		return "realizar labores administrativos";
	}
	
	private int categoriaBonus() {
		if (this.getclase() = clase.clase3) {
			return 3300;
		}
		if (this.getClase() = clase.clase4) {
			return 2200;
		}
		if (this.getClase() = clase.clase5) {
			return 1100;
		}
	}

}
