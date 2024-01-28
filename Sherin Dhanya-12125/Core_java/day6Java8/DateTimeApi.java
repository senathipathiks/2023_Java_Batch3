package com.day6Java8;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeApi {

	public static void main(String[] args) {
	LocalTime time=LocalTime.now();
	System.out.println(time);

	LocalDateTime systime=LocalDateTime.now();
	System.out.println(systime);
	
	LocalTime zone=LocalTime.now(ZoneId.of("Asia/Kolkata"));
	System.out.println(zone);
	
//	for(String s: ZoneId.getAvailableZoneIds()) {
//		System.out.println(s);
//	}
	LocalDateTime date =LocalDateTime.now();
	System.out.println(date.getMonth());
	System.out.println(date.getYear());
	System.out.println(date.getDayOfYear());
	System.out.println(date.getMinute());
	DateTimeFormatter pattern= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	System.out.println(date.format(pattern));
	System.out.println(pattern);
	}
}

