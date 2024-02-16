package enumerados;

public class Cuenta {
	
		
	}
	enum tipoCuenta{
		CuentaAhorro("","","Cuenta Ahorro",0,0),
		CuentaCorriente("","","Cuenta Corriente",0,0);
		
		private String nombre;
		private String apellido;
		private String tipoCuenta;
		private int numerodecuenta;
		private int saldo;
		
		tipoCuenta(String nombre, String apellido, String tipoCuenta, int numerodecuenta, int saldo) {
			// TODO Auto-generated constructor stub
			this.nombre=nombre;
			this.apellido=apellido;
			this.tipoCuenta=tipoCuenta;
			this.numerodecuenta=numerodecuenta;
			this.saldo=saldo;
		}
	
	public String getNombre() {
			return nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public int getNumerodecuenta() {
			return numerodecuenta;
		}
		public int getSaldo() {
			return saldo;
		}
		public String getTipoCuenta() {
			return tipoCuenta;
		}
		public void setTipoCuenta(String tipoCuenta) {
			this.tipoCuenta = tipoCuenta;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public void setNumerodecuenta(int numerodecuenta) {
			this.numerodecuenta = numerodecuenta;
		}
		public void setSaldo(int saldo) {
			this.saldo = saldo;
		}





		@Override
		public String toString() {
			return "Cuenta [nombre=" + nombre + ", apellido=" + apellido + ", tipoCuenta=" + tipoCuenta
					+ ", numerodecuenta=" + numerodecuenta + ", saldo=" + saldo + "]";
		}
	
    }
