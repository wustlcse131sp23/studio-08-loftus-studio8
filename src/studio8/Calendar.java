package studio8;

import java.util.HashSet;

public class Calendar {
		

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
		
		HashSet<Appointment> calendar = new HashSet<Appointment>();
		calendar.add(appt1);
		calendar.add(appt2);
		calendar.add(appt3);
		System.out.println(calendar);
}
}

