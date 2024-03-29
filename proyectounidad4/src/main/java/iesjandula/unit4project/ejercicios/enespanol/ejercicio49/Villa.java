package iesjandula.unit4project.ejercicios.enespanol.ejercicio49;

import java.util.Objects;

public class Villa extends Municipio implements Comparable<Municipio>, IAlcalde {

	public Villa(String nombre, int poblacion, double temperatura, double altitud, Alcalde alcalde) {
		super(nombre, poblacion, temperatura, altitud, alcalde);
	}

	@Override
	public boolean esPedania() {

		return false;
	}

	@Override
	public String infoAlcalde() {

		return this.getAlcalde().infoAlcalde();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(getAlcalde());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Villa other = (Villa) obj;
		return Objects.equals(getAlcalde(), other.getAlcalde());
	}

	@Override
	public String toString() {
		return "Villa [alcalde=" + getAlcalde() + ", Nombre=" + getNombre() + ", Poblacion=" + getPoblacion()
				+ ", Temperatura=" + getTemperatura() + ", Altitud=" + getAltitud() + "]";
	}

	@Override
	public int compareTo(Municipio o) {
		
		int compare;
		if (this.getPoblacion() == o.getPoblacion()) {
			compare = this.getNombre().compareTo(o.getNombre());
		} else {
			compare = this.getAlcalde().compareTo(getAlcalde());
		}
		return compare;
	}

}
