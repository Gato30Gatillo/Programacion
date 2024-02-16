package FundamentosOrientacionAObjetos;

public class CocheDeportivo extends Coche {

	private static final String Type_CD="Coche Deportivo";
	
	public CocheDeportivo(String color, String marca, String modelo,double precio, double coste) {
        super();
	
	}

	@Override
	public String toString() {
		return "CocheDeportivo [getPrecio()=" + getPrecio() + ", getCoste()=" + getCoste() + ", getColor()=" + getColor()
				+ ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + "]";
	}

	@Override
	public String getTipoCoche() {
		// TODO Auto-generated method stub
		return Type_CD;
	}
}
