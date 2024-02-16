package ejercicios.ejercicio8Ingles;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}


	public int getHour() {
		return hour;
	}


	public void setHour(int hour) {
		this.hour = hour;
	}


	public int getMinute() {
		return minute;
	}


	public void setMinute(int minute) {
		this.minute = minute;
	}


	public int getSecond() {
		return second;
	}


	public void setSecond(int second) {
		this.second = second;
	}
	
	public void setTime(int hour, int minute, int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	
	public Time nextSecond() {
		Time t = new Time(1, 2, 3); 
		this.second++;
		    if (this.second > 59) {
		        this.second = 0;
		        this.minute++;
		        if (this.minute > 59) {
		            this.minute = 0;

		            this.hour++;
		        }
		        if (this.hour > 23) {
		            this.hour = 0;
		        }
		    }
		    t.hour=this.hour;
		    t.minute=this.minute;
		    t.second=this.second;
		    return t;
	}
	public Time previousSecond() {
		Time t = new Time(1, 2, 3);
		this.second--;
	    if (this.second < 0) {
	        this.second = 59;
	        this.minute--;
	        if (this.minute < 0) {
	            this.minute = 59;

	            this.hour--;
	        }
	        if (this.hour < 0) {
	            this.hour = 23;
	        }
	        
	    }
	    t.hour=this.hour;
	    t.minute=this.minute;
	    t.second=this.second;
	    return t;
	}
	

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}
	
	
}




