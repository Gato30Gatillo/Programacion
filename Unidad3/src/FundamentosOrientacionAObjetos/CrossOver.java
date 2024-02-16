package FundamentosOrientacionAObjetos;

public class CrossOver extends Coche {

	private static final String Type_CD="Coche CrossOver";
	
	public CrossOver(String color, String marca, String modelo,double precio, double coste) {
        super();
	
	}

	@Override
	public String toString() {
		return "CrossOver [getPrecio()=" + getPrecio() + ", getCoste()=" + getCoste() + ", getColor()=" + getColor()
				+ ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + "]";
	}

	@Override
	public String getTipoCoche() {
		// TODO Auto-generated method stub
		return Type_CD;
	}
}
