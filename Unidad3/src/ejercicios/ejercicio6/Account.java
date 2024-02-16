package ejercicios.ejercicio6;

public class Account {
		
	private String id;
	private String name;
	private int balance=0;
	private EnumAccount type;
	
	public Account() {
		
	}
	
	
	public Account(String id, String name, int balance,EnumAccount type) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.type = type;
	}


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getBalance() {
		return balance;
	}


	public int credit(int amount) {
		this.balance=+amount;
		return balance;
	}
	public int debit(int amount) {
		if(amount<=this.balance) {
			this.balance =-amount;
		}
		else {
			System.out.print("Amount exceeded balance");
		}
		return balance;
	}
	
		public int transferTo(Account another, int amount) {
			if(amount<=this.balance) {
				another.balance=another.balance+amount;
			}
			else {
				System.out.print("Amount exceeded balance");
			}
			return balance;
		}


		public EnumAccount getType() {
			return type;
		}


		public void setType(EnumAccount type) {
			this.type = type;
		}
		
		
		public String getAccountTypeDesc() {
			return type.getDescripcion();
		}
		
		public boolean isDefaulting() {
			if(this.balance<0) {
				return true;
			}
			else {
				return false;
			}
		}


		@Override
		public String toString() {
			return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
		}
	
}
