package ejercicios.ejercicio34;

public class Ortopedista extends Medico{

	private TipologiaO tipo;

	public Ortopedista(TipologiaO tipo) {
		super();
		this.tipo = tipo;
	}
	
	public TipologiaO getTipo() {
		return tipo;
	}

	public void setTipo(TipologiaO tipo) {
		this.tipo = tipo;
	}

}
