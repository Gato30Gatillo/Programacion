package ejercicios.cuenta;

public class Cuenta {
	
	float saldo;
	int NumeroDeDepositos=0;
	int NumeroDeRetiros=0;
	float TasaAnual;
	float ComisionMensual=0;
	int transacciones;
	public Cuenta() {
		
	}
	
	public Cuenta(float saldo, int numeroDeDepositos, int numeroDeRetiros, float tasaAnual, float comisionMensual) {
		this.saldo = saldo;
		NumeroDeDepositos = numeroDeDepositos;
		NumeroDeRetiros = numeroDeRetiros;
		TasaAnual = tasaAnual;
		ComisionMensual = comisionMensual;
	}

	public float getSaldo() {
		return saldo;
	}

	public int getNumeroDeDepositos() {
		return NumeroDeDepositos;
	}

	public int getNumeroDeRetiros() {
		return NumeroDeRetiros;
	}

	public float getTasaAnual() {
		return TasaAnual;
	}

	public float getComisionMensual() {
		return ComisionMensual;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void setNumeroDeDepositos(int numeroDeDepositos) {
		NumeroDeDepositos = numeroDeDepositos;
	}

	public void setNumeroDeRetiros(int numeroDeRetiros) {
		NumeroDeRetiros = numeroDeRetiros;
	}

	public void setTasaAnual(float tasaAnual) {
		TasaAnual = tasaAnual;
	}

	public void setComisionMensual(float comisionMensual) {
		ComisionMensual = comisionMensual;
	}
	
	public void depositar(float deposito) {
		this.saldo= saldo + deposito; 
	}
	
	public void retirar(float retiro) {
		if(saldo>retiro)
		this.saldo=saldo-retiro;
	}
	public void CalcularInteres() {
		float interesMensual=TasaAnual/12;
		interesMensual=interesMensual*saldo;
		this.saldo=saldo+interesMensual;
	}
	
	public void ExtractoMensual() {
		this.saldo=saldo-ComisionMensual;
		CalcularInteres();
		
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", NumeroDeDepositos=" + NumeroDeDepositos + ", NumeroDeRetiros="
				+ NumeroDeRetiros + ", TasaAnual=" + TasaAnual + ", ComisionMensual=" + ComisionMensual + "]";
	}
	
	
	

}
	