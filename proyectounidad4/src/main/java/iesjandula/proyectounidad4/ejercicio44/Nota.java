package iesjandula.proyectounidad4.ejercicio44;

import java.util.Objects;

public abstract class Nota implements Comparable<Nota>{

	private int id;
	private String texto;
	private int numPalabraComienzo;
	public Nota(int id, String texto, int numPalabraComienzo) {
		super();
		this.id = id;
		this.texto = texto;
		this.numPalabraComienzo = numPalabraComienzo;
	}
	public int getId() {
		return id;
	}
	public String getTexto() {
		return texto;
	}
	public int getNumPalabraComienzo() {
		return numPalabraComienzo;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public void setNumPalabraComienzo(int numPalabraComienzo) {
		this.numPalabraComienzo = numPalabraComienzo;
	}
	@Override
	public String toString() {
		return "Nota [id=" + id + ", texto=" + texto + ", numPalabraComienzo=" + numPalabraComienzo + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(numPalabraComienzo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nota other = (Nota) obj;
		return numPalabraComienzo == other.numPalabraComienzo;
	}
	@Override
	public int compareTo(Nota o) {
		int comienzo=this.numPalabraComienzo;
		return this.numPalabraComienzo;
	}
	
	
	
}
