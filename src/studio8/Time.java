package studio8;

import java.util.Objects;

public class Time {
	public int hour;
	public int minute;
	public boolean isMilitaryTime;
	
	/*
	 * hour - hour of the day
	 * minute - minute within the hour
	 * isMilitaryTime - indicate whether to print as 12hr time or 24hr time
	 */
	public Time(int hour, int minute, boolean isMilitaryTime) {
		this.hour = hour;
		this.minute = minute;
		this.isMilitaryTime = isMilitaryTime;
	}
	
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public boolean getIsMilitaryTime() {
		return isMilitaryTime;
	}
	public String toString() {
		return this.getHour() + ":" + this.getMinute() + " " + this.getIsMilitaryTime();
	}
	
	public static void main(String[] args) {
		Time time1 = new Time(7, 23, true);
		System.out.println(time1);
    	
		Time time2 = new Time(3, 18, false);
		System.out.println(time2);
		
		Time time3 = new Time(7, 23, true);
		System.out.println(time3);
		
		System.out.println(time1.equals(time2));
		System.out.println(time2.equals(time3));
		System.out.println(time1.equals(time3));
    }

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

}