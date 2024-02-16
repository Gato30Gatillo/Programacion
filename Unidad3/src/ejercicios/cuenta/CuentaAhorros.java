package ejercicios.cuenta;

public class CuentaAhorros extends Cuenta {

	boolean Activa;

	CuentaAhorros(){
	}
	
	public CuentaAhorros(boolean activa) {
		Activa = activa;
	}

	public boolean isActiva() {
		return Activa;
	}
	
	public void setActiva(boolean activa) {
		if(saldo>10000)
		this.Activa = true;
	}
	@Override
	public void retirar(float cantidad){
		if(this.Activa==true)
		retirar(cantidad);
		transacciones++;
	}
	@Override
	public void depositar(float cantidad){
		if(this.Activa==true)
		depositar(cantidad);
		transacciones++;
	}
	@Override
	public void ExtractoMensual() {
		if(NumeroDeRetiros>4)
			saldo=saldo-(transacciones-4)*1000;
		setActiva(Activa);
	}
	

	@Override
	public String toString() {
		return "CuentaAhorros [saldo=" + saldo + ", ComisionMensual=" + ComisionMensual + ", transacciones="
				+ transacciones + "]";
	}
	
}
