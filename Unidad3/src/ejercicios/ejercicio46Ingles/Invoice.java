package ejercicios.ejercicio46Ingles;

public class Invoice implements Comparable<Invoice>{

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
	@Override
	public int compareTo(Invoice o) {
		// TODO Auto-generated method stub
		return this.getCustomer().compareTo(o.getCustomer());
	}
	
}
