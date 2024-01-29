package com.Day6;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateApi {

	public static void main(String[] args) {
		
		//LocalTime time = LocalTime.now();
		//System.out.println(time);
		
//		LocalDateTime sysTime =LocalDateTime.now();
//		
//		System.out.println(sysTime);
		
//		LocalTime sysTime =LocalTime.now(ZoneId.of("Europe/Monaco"));
//		
//			System.out.println(sysTime);
//			
			
//			for (String string : ZoneId.getAvailableZoneIds()) {
//				
//				System.out.println(string);
//			}
			
			
			LocalDateTime date = LocalDateTime.now();
			
			System.out.println("The month is :"+date.getMonthValue());
			
			System.out.println("The day of the month is "+date.getDayOfYear());
			
			System.out.println("The year is :"+date.getYear());
			
			
			DateTimeFormatter pattern =DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			
			System.out.println(date.format(pattern));
			
			System.out.println(pattern);
			
			

	}

}
