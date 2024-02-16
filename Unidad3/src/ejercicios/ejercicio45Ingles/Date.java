package ejercicios.ejercicio45Ingles;

public class Date implements Comparable<Date> {

	private int day;
	private int month;
	private int year;

	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
	public void setDate(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}


	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}


	@Override
	public int compareTo(Date o) {
		int comparacion;
		comparacion= this.year > o.getYear()?1:(this.year==o.getYear()?0:-1);
		if (comparacion==0) {
		comparacion= this.month > o.getMonth()?1:(this.month==o.getMonth()?0:-1);
		if (comparacion==0) {
		comparacion= this.day > o.getDay()?1:(this.day==o.getDay()?0:-1);
		}
		}
		return comparacion;
		
	}
	
}


