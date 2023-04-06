package studio8;

import java.util.Objects;

public class Appointment {
	public Date date1;
	public Time time1;
	
	public Appointment(Date date1, Time time1) {
		this.date1 = date1;
		this.time1 = time1;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(date1, time1);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date1, other.date1) && Objects.equals(time1, other.time1);
	}


	public static void main(String[] args) {
		Date date = new Date("April", 6, 2023, false);
		Time time = new Time(7, 23, true);
		
		Date date2 = new Date("April", 18, 2023, false);
		Time time2 = new Time(6, 30, true);
		
		Date date3 = new Date("April", 24, 2023, false);
		Time time3 = new Time(5, 00, true);
		
		
		Appointment appt1 = new Appointment(date, time);
		Appointment appt2 = new Appointment(date2, time2);
		Appointment appt3 = new Appointment(date3, time3);
		
	}

}
