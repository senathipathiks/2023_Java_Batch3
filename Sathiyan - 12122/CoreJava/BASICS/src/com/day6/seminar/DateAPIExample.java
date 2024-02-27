package com.day6.seminar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//import java.time.LocalTime;
//import java.time.ZoneId;

public class DateAPIExample {

	public static void main(String[] args) {
		
//		LocalTime time=LocalTime.now();
//		System.out.println(time);
		
		LocalDateTime systime=LocalDateTime.now();
//		System.out.println(systime);
		
//		LocalTime zone=LocalTime.now(ZoneId.of("Asia/Dubai"));
//		System.out.println(zone);
		
//		LocalTime zone2=LocalTime.now(ZoneId.of("Asia/Kolkata"));
//		System.out.println(zone2);
		
		//To find the Time zone that compiler have
//		for (String s : ZoneId.getAvailableZoneIds()) {
//			System.out.println(s);
//		}
		
		System.out.println("The month is :"+systime.getMonthValue());
		System.out.println("The day is : "+systime.getDayOfYear());
		System.out.println("The year is : "+systime.getYear());
		

		DateTimeFormatter pattern=DateTimeFormatter.ofPattern("dd-MM-yyyy -- hh:mm:SS");
		System.out.println(systime.format(pattern));
		
	}

}
