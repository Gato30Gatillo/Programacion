package ejercicios.ejercicio55;

public abstract class  EmpleadoEducacion {

	private String nombre;
	private String apellidos;
	private Long telefono;
	private String direccion;
	private double sueldo;
	private double IRPF;
	private int horario;
	private String funciones;
	
	public EmpleadoEducacion(String nombre, String apellidos, Long telefono, String direccion, double sueldo,
			double iRPF, int horario, String funciones) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.direccion = direccion;
		this.sueldo = sueldo;
		IRPF = iRPF;
		this.horario = horario;
		this.funciones = funciones;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public Long getTelefono() {
		return telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public double getSueldo() {
		return sueldo;
	}
	public double getIRPF() {
		return IRPF;
	}
	public int getHorario() {
		return horario;
	}
	public String getFunciones() {
		return funciones;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public void setIRPF(double iRPF) {
		IRPF = iRPF;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	public void setFunciones(String funciones) {
		this.funciones = funciones;
	}
	public abstract double calculoDeSueldo();
	public abstract double calculoDeImpuesto();
	public abstract String funcion();
	
	@Override
	public String toString() {
		return "EmpleadoEducacion [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", sueldo=" + sueldo + ", IRPF=" + IRPF + ", horario=" + horario
				+ ", funciones=" + funciones + "]";
	}
	
	
}
