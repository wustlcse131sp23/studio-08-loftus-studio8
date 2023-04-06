package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	public String month;
	public int day;
	public int year;
	public boolean isHoliday;

	/*
	 * month - month of the year
	 * day - day of the month
	 * isHoliday - indicates whether selected date is a federal holiday or not
	 */
	public Date(String month, int day, int year, boolean isHoliday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}
	
	public String getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public int getYear() {
		return year;
	}
	public boolean getIsHoliday() {
		return isHoliday;
	}
	
	public String toString() {
		return this.getMonth() + " " + this.getDay() + ", " + this.getYear() + " " + this.getIsHoliday();
	}
	
    @Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && Objects.equals(month, other.month) && year == other.year;
	}

	public static void main(String[] args) {
    	Date date1 = new Date("April", 6, 2023, false);
    	System.out.println(date1);
    	
    	Date date2 = new Date("January", 24, 2022, false);
    	System.out.println(date2);
    	
    	Date date3 = new Date("April", 6, 2023, false);
    	System.out.println(date3);
    	
    	Date date4 = new Date("September", 15, 2016, true);
    	System.out.println(date4);
    	
    	Date date5 = new Date("December", 3, 1999, false);
    	System.out.println(date5);
    	
    	System.out.println(date1.equals(date2));
		System.out.println(date2.equals(date3));
		System.out.println(date1.equals(date3));
		
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(date1);
		list.add(date2);
		list.add(date3);
		list.add(date4);
		list.add(date5);
		System.out.println(list);
		
		HashSet<Date> set = new HashSet<Date>();
		set.add(date1);
		set.add(date2);
		set.add(date3);
		set.add(date4);
		set.add(date5);
		System.out.println(set);
    }

}
