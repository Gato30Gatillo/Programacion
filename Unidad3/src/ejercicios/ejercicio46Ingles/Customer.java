package ejercicios.ejercicio46Ingles;

public class Customer implements Comparable<Customer> {

	private int id;
	private String name;
	private int discaunt;
	
	
	public Customer(int id, String name, int discaunt) {
		super();
		this.id = id;
		this.name = name;
		this.discaunt = discaunt;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getDiscaunt() {
		return discaunt;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDiscaunt(int discaunt) {
		this.discaunt = discaunt;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", discaunt=" + discaunt + "]";
	}
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.getId()-o.getId();
	}
	
	
}


