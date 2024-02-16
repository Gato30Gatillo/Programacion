package ejercicios.cuenta;

public class CuentaCorriente extends Cuenta{

	float sobregiro=0;
	
	CuentaCorriente(){
	}
	
	public CuentaCorriente(float sobregiro) {
		sobregiro = sobregiro;
	}
	
	
	
	
	@Override
	public void retirar(float cantidad){
		if(cantidad>saldo)
			sobregiro=sobregiro+(cantidad-saldo);
		retirar(cantidad);
		transacciones++;
	}
	@Override
	public void depositar(float cantidad){
		if(sobregiro>0)
			sobregiro=sobregiro-cantidad;
			if (cantidad>sobregiro) {
				sobregiro=0;
				cantidad=cantidad-sobregiro;
			}
			else {
				cantidad=0;
			}
		depositar(cantidad);
		transacciones++;
	}
	@Override
	public void ExtractoMensual() {
		ExtractoMensual();
	}
	

	@Override
	public String toString() {
		return "CuentaCorriente [sobregiro=" + sobregiro + ", saldo=" + saldo + ", ComisionMensual=" + ComisionMensual
				+ ", transacciones=" + transacciones + "]";
	}
}