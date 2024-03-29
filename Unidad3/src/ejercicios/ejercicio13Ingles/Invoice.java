package ejercicios.ejercicio13Ingles;

public class Invoice{

	private int id;
	private Customer customer;
	private double amount;
	public Invoice(int id, Customer customer, double amount) {
		super();
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}
	public int getId() {
		return id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public double getAmount() {
		return amount;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", customer=" + customer + ", amount=" + amount + "]";
	}
	
}
