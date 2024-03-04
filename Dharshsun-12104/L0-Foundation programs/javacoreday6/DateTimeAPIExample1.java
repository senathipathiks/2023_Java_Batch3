package com.javacoreday6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeAPIExample1 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println("System Date : "+date.getDayOfMonth());
		
		LocalTime time = LocalTime.now();
		System.out.println("System Time : "+time);
		
		LocalTime time1 = LocalTime.now(ZoneId.of("Europe/Moscow"));
//		System.out.println("Time Zone in Europe/Moscow : "+time1.format());
		
		System.out.println("Month : "+date.getMonth());	
		System.out.println("Day : "+date.getDayOfMonth());//display current day in 33 if it is getdayofyear.
		System.out.println("Year : "+date.getYear());
		
		System.out.println("Date :"+date.getDayOfYear()+"-"+date.getMonth()+"-"+date.getYear());
		
//		System.out.println("Time Zone List");
//		ZoneId.getAvailableZoneIds().forEach((s)->System.out.println(s));
		
		LocalDateTime date1 = LocalDateTime.now();
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println("Date : dd-mm-yyyy : "+date1.format(pattern));
		
		
		
		

	}

}
