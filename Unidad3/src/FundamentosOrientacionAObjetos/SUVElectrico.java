package FundamentosOrientacionAObjetos;

public class SUVElectrico extends SUV implements InterfaceElectrico, IAsientos {

	private static final String TYPE_SUV_ELECTRICO="SUVElectrico";
	private double capacidadBateria=0;
	private double consumo=0;
	private int numAsientos=0;

	public SUVElectrico(String color, String marca, String modelo, double precio,
			double coste, double capacidadBateria,double consumo, int numAsientos) {

		super(color, marca, modelo, precio, coste);
		this.capacidadBateria=capacidadBateria;
		this.consumo=consumo;
		this.numAsientos=numAsientos;
	
	}
	
	
	public String getTipoCoche() {

		return TYPE_SUV_ELECTRICO;

	}
	
	
	@Override
	public double capacidadBateria () {

	return capacidadBateria;

	}
	
	
	@Override
	public double consumoParaCienKilometros() {

	return consumo;

	}


	@Override
	public String toString() {
		return "SUVElectrico [capacidadBateria=" + capacidadBateria + ", consumo=" + consumo + ", numAsientos="
				+ numAsientos + ", toString()=" + super.toString() + ", getPrecio()=" + getPrecio() + ", getCoste()="
				+ getCoste() + ", getColor()=" + getColor() + ", getMarca()=" + getMarca() + ", getModelo()="
				+ getModelo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


	@Override
	public double autonomia() {

		return capacidadBateria/consumo;

	}


	@Override
	public int numeroDeAsientos() {

		return numAsientos;

	}

}