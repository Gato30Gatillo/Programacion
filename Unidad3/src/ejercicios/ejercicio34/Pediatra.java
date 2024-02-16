package ejercicios.ejercicio34;

public class Pediatra extends Medico{

	private Tipologia tipo;

	public Pediatra(Tipologia tipo) {
		super();
		this.tipo = tipo;
	}

	public Tipologia getTipo() {
		return tipo;
	}

	public void setTipo(Tipologia tipo) {
		this.tipo = tipo;
	}
	
	
	
}
