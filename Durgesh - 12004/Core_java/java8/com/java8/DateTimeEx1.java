package com.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeEx1 {

	public static void main(String[] args) {
		
		//function to find current date
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		//function to find current time
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		//function to find current date with our own format
		LocalDateTime date1 = LocalDateTime.now();
		DateTimeFormatter patt = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
		System.out.println("The formatted date and time is: "+date1.format(patt));
		
		//function to find current date based on the zone
		LocalTime d = LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(d);
		
//		for (String s : ZoneId.getAvailableZoneIds()) {
//			System.out.println(s);			
//		}
		
		//function to find current month name and number value of that month 
		System.out.println("The Month is: "+date.getMonth());
		System.out.println("The Month is: " +date.getMonthValue());
		
		//function to find current year and day of the month 
		System.out.println("The year is: " +date.getYear());
		System.out.println("The day of the month is: "+date.getDayOfYear());
		
				
	}

}
