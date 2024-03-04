package iesjandula.proyectounidad4.ejercicio44;

public class NotaMarcada extends Nota implements Comparable<Nota>{

	private String color;
	
	public NotaMarcada(int id, String texto, int numPalabraComienzo,String color) {
		super(id, texto, numPalabraComienzo);
		// TODO Auto-generated constructor stub
		this.color=color;
	}

	@Override
	public int compareTo(Nota o) {
		
		return this.getNumPalabraComienzo();
	}	
	
}
