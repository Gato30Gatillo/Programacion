package enumerados;

public class Employee {

	private int id;
	private String firstname;
	private String lastname;
	private int salary;
	Employee(){
		
	}
		Employee( int id, String firstname, String lastname, int salary){
	
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.salary=salary;
	}
	
	public int getid() {
		return this.id;
	}
	
	public String getfirstname() {
		return this.firstname;
	}
	
	public String getlastname() {
		return this.firstname;
	}
	public String getname() {
		return firstname+" "+lastname;
	}
	
	public int getsalary() {
		return this.salary;
	}
	public void setsalary(int salary) {
		this.salary= salary;
	}
	public int getAnnualsalary() {
		return salary*12;
	}
	
	public int raisesalary(int percent) {
		double percentage = (double)percent/100;
		double salaryDec=this.salary;
		salaryDec+=salaryDec*percentage;
		setsalary((int) Math.round(salaryDec));
		
		return this.salary;
	}
	
	@Override
	public String toString() {
        return "Employee [id=" + id + ", firstname = " + firstname +
        ", lastname = " + lastname +",  salario= " + salary +"]";
    }
	
	
}
