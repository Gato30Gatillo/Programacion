package ejercicios.ejercicio37;

public class PuertaCoche extends ComponenteDeCoche implements Alarma,PuertaBloqueable {

	private boolean estaBloqueada=false;
	private boolean estaAbierta=false;
	private boolean estaActivada=true;
	
	public PuertaCoche(String descripcion, double peso, double coste, 
			boolean estaBloqueada, boolean estaAbierta, boolean estaActivada) {
		super(descripcion, peso, coste);
		this.estaBloqueada=estaBloqueada;
		this.estaAbierta=estaAbierta;
		this.estaActivada=estaActivada;
	}

	@Override
	public void Abrir() {
		// TODO Auto-generated method stub
		System.out.println("Puerta Abierta");
		estaAbierta=true;
	}

	@Override
	public void Cerrar() {
		// TODO Auto-generated method stub
		System.out.println("Puerta Cerrada");
		estaAbierta=false;
	}

	@Override
	public void bloquea() {
		// TODO Auto-generated method stub
		System.out.println("Puerta Bloqueada");
		estaBloqueada=true;
	}

	@Override
	public void desbloquea() {
		// TODO Auto-generated method stub
		System.out.println("Puerta Bloqueada");
		estaBloqueada=false;
		
	}

	@Override
	public boolean alarmaActivada() {
		// TODO Auto-generated method stub
		return estaActivada;
	}

	@Override
	public void ActivarAlarma() {
		// TODO Auto-generated method stub
		System.out.println("Alarma Activada");
		estaActivada=true;
	}

	@Override
	public void DesactivarAlarma() {
		// TODO Auto-generated method stub
		System.out.println("Alarma Desactivada");
		estaActivada=false;
	}

}
