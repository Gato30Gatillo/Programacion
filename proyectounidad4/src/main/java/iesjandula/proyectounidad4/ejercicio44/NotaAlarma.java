package iesjandula.proyectounidad4.ejercicio44;

public class NotaAlarma extends Nota {

	private int hora;

	public NotaAlarma(int id, String texto, int numPalabraComienzo,int hora) {
		super(id,texto,numPalabraComienzo);
		this.hora = hora;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "NotaAlarma [hora=" + hora + ", Id=" + getId() + ", Texto=" + getTexto()
				+ ", NumPalabraComienzo=" + getNumPalabraComienzo() + "]";
	}


}
