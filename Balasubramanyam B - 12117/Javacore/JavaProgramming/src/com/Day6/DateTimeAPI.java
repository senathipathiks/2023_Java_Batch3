package com.Day6;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class DateTimeAPI {

	public static void main(String[] args) {
	for(String i:ZoneId.getAvailableZoneIds()) {
		System.out.println(i);}
	LocalTime time = LocalTime.now();
	System.out.println(time);
	LocalDateTime date = LocalDateTime.now();
	System.out.println(date);
	LocalTime time1 = LocalTime.now(ZoneId.of("Asia/Kolkata"));
	System.out.println(time1);
	DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-dd-MM hh:mm:ss");
	System.out.println(date.format(pattern));
	System.out.println(pattern);
	System.out.println("Month: "+date.getMonthValue());
	System.out.println("day of the month: "+date.getDayOfMonth());
	System.out.println("year: "+date.getYear());
	
	
	}

}
