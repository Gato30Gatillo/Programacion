package FundamentosOrientacionAObjetos;

public class SUV extends Coche {
	public SUV(String color, String marca, String modelo, double precio, double coste) {

		super(color, marca, modelo, precio, coste);

	}
	
	private static final String Type_CD="SUV";

	@Override
	public String toString() {
		return "SUV [getPrecio()=" + getPrecio() + ", getCoste()=" + getCoste() + ", getColor()=" + getColor()
				+ ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + "]";
	}

	@Override
	public String getTipoCoche() {
		// TODO Auto-generated method stub
		return Type_CD;
	}
	
	
	
}
