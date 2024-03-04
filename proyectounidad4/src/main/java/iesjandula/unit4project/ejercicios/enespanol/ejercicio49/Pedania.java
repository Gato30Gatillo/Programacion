package iesjandula.unit4project.ejercicios.enespanol.ejercicio49;

public class Pedania extends Municipio implements IAlcalde {

	private Villa villa;
	
	public Pedania(String nombre, int poblacion, double temperatura, double altitud, 
			Villa villa) {
		super(nombre, poblacion, temperatura, altitud,villa.getAlcalde());
		// TODO Auto-generated constructor stub
		this.villa=villa;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Pedania [villa=" + villa.getNombre() + ", Alcalde=" + getAlcalde() + ", Nombre=" + getNombre()
				+ ", Poblacion=" + getPoblacion() + ", Temperatura=" + getTemperatura() + ", Altitud="
				+ getAltitud() + "]";
	}




	@Override
	public boolean esPedania() {
		// TODO Auto-generated method stub
		return true;
	}




	@Override
	public String infoAlcalde() {
		// TODO Auto-generated method stub
		return villa.getAlcalde().infoAlcalde();
	}

}
