package iesjandula.proyectounidad4.ejercicio51;

public class Empresa {

	private final int MAX_CLIENTE = 1000;

	private final int MAX_EMPLEADO = 1000;
	
	private int contEmpleados=0;

	private int contClientes=0;
	
	private String NIF;

	private String nombre;

	private double beneficios;

	private Cliente[] clientes = new Cliente[MAX_CLIENTE];

	private Empleado[] empleados = new Empleado[MAX_EMPLEADO];

	public Empresa(String nIF, String nombre, double beneficios) {

		NIF = nIF;
		this.nombre = nombre;
		this.beneficios = beneficios;

	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(double beneficios) {
		this.beneficios = beneficios;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	public Empleado[] getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleado[] empleados) {
		this.empleados = empleados;
	}

	@Override

	public String toString() {
		return "Empresa [NIF=" + NIF + ", nombre=" + nombre + ", beneficios=" + beneficios + "]";

	}

	/**
	 * 
	 * Añade un empleado si hay sitio, sino devuelve fals
	 * 
	 */
	
	public boolean addEmpleado(Empleado e) {
		boolean encontrado=false;
		for(int i=0;i<MAX_EMPLEADO && !encontrado; i++) {
			if(empleados[i]==null) {
				empleados[i]=e;
				contEmpleados++;
				encontrado=true;
			}
		}
		return encontrado;
	}


	/**
	 * 
	 * Borra un empleado si lo encuentra sino devuelve false
	 * 
	 */

	public boolean borrarEmpleado(Empleado e) {
		boolean encontrado=false;
		int cont;
		for(int i=0;i<MAX_EMPLEADO && !encontrado; i++) {
			if(empleados[i]==e) {
				empleados[i]=null;
				contEmpleados--;
				encontrado=true;
			}
		}
		return encontrado;
	}

	/**
	 * 
	 * Añade un cliente si hay sitio, sino devuelve fals
	 * 
	 */

	public boolean AddCliente(Cliente c) {
		return false;
	}

	/**
	 * 
	 * Borra un cliente si lo encuentra sino devuelve false
	 * 
	 */

	public boolean borrarCliente(Cliente c) {
		return false;
	}

	/**
	 * 
	 * Busca un empleado por nif si lo encuentra sino devuelve nulo
	 * 
	 */

	public Empleado buscarEmpleadoPorNif(String nif) {
		int posicion=0;
		boolean encontrado=false;
		Empleado empRes=null;
		
		for(int i=0; i<MAX_EMPLEADO && !encontrado;i++) {
			if(empleados[i]!=null && empleados[i].getNif().equals(nif)) {
				empRes=empleados[i];
				encontrado=true;
			}
		}
		
		return null;
	}

	/**
	 * 
	 * Busca un empleado por nombre si lo encuentra sino devuelve nulo
	 * 
	 */

	public Empleado buscarEmpleadoPorNombre(String nombre) {
		return null;
	}

	/**
	 * 
	 * Busca un cliente por nif si lo encuentra sino devuelve nulo
	 * 
	 */

	public Cliente buscaClientePorNif(String nif) {
		return null;
	}

	/**
	 * 
	 * Busca un cliente por nombre si lo encuentra sino devuelve nulo
	 * 
	 */

	public Cliente buscarClientePorNombre(String nombre) {
		return null;
	}

	/**
	 * 
	 * Devuelve un array con todos los directivos, podeis usar instance of o
	 * 
	 * el tipo de empleado para identificar quien es Directivo
	 * 
	 */

	public Directivo[] getDirectivos() {
		
		int numDirectivos=contarDirectivos();
		Directivo[] direcRes= new Directivo[numDirectivos];
		int cont=0;
		
		for(int i=0;cont<numDirectivos && i<MAX_EMPLEADO;i++) {
			if(empleados[i] instanceof Directivo) {
				direcRes[cont]= (Directivo) empleados[i];
				cont++;
			}
		}
		return null;
	}
	
	private int contarDirectivos() {
		int cont=0;
		for(Empleado emp: empleados) {
			if(emp instanceof Directivo) {
				cont++;
			}
		}
		return cont;
	}

	/**
	 *
	 * Devuelve un array con todos los subdirectivos, podeis usar instance of o
	 * 
	 * el tipo de empleado para identificar quien es Subdirectivo 
	 * 
	 */

	public Subdirectivo[] getSubdirectivos() {
		return null;
	}

	/**
	 * 
	 * Devuelve un array con todos los técnicos, podeis usar instance of o
	 * 
	 * el tipo de empleado para identificar quien es Tecnico
	 * 
	 */

	public Tecnico[] getTecnicos() {
		return null;
	}

	/**
	 *
	 * recorre el array de empleados sumando los salarios de todos los empleados
	 * 
	 */

	private double calcularSalariosTotales() {
		
		double sumSalarios=0;
		
		for(Empleado emp: empleados) {
			if (emp!=null){
				sumSalarios+=emp.calcularSueldo(sumSalarios);
			}
		}
		
		return 0.0;
	}

}
