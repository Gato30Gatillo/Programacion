package iesjandula.proyectounidad4.ejercicio49;

public class Departamento {

	private static final int Municipio_MAX = 200;
	private String nombre;
	private Municipio[] municipios;
	
	
	public Departamento(String nombre, Municipio[] municipios) {
		this.nombre = nombre;
		municipios = new Municipio[Municipio_MAX];
	}


	public String getNombre() {
		return nombre;
	}


	public Municipio[] getMunicipios() {
		return municipios;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean agregarMunicipio(Municipio municipio) {
	boolean hayHueco=false;
	for (int i=0;i<municipios.length && !hayHueco;i++) {
		if(municipios[i]==null) {
			hayHueco=true;
		}
		if(hayHueco) {
			municipios[i]= municipio;
		}
	}
	return hayHueco;
		
	}
	
	public boolean eliminarMunicipio(String nombre) {
		boolean encontrado = false;
		for (int i = 0; i < Municipio_MAX && !encontrado; i++) {
			if (municipios[i].equals(nombre)) {
				encontrado = true;
				municipios[i] = null;
			}
		}
		return encontrado;
	}
	
	public boolean buscarMunicipio(String nombre) {
		boolean encontrado = false;
		for (int i = 0; i < Municipio_MAX && !encontrado; i++) {
			if (municipios[i].equals(nombre)) {
				encontrado = true;
			}
		}
		return encontrado;
	}
	
	public Municipio buscarMunicipioConPoblacionMayor(int poblacion) {
		
		boolean encontrado = false;
		int cont=0;
		for (int i = 0; i < Municipio_MAX && !encontrado; i++) {
			if (municipios[i].getPoblacion()>poblacion) {
				encontrado = true;
			}
			cont++;
		}
		return municipios[cont];
	}
	
	public int censoPoblacionDepartamento() {
		int suma=0;
		
		for(int i = 0; i < municipios.length; i++) {
		suma=+ municipios[i].getPoblacion();
		}
		
		return suma;
	}
}
