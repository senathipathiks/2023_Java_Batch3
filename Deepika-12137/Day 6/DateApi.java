package com.day6;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateApi {
public static void main(String[] args) {
	
	LocalTime time=LocalTime.now();
	System.out.println(time);
	
	LocalDateTime date = LocalDateTime.now();
	System.out.println("This month is : "+date.getMonthValue());
	System.out.println("Todays day "+date.getDayOfYear());
	System.out.println("current year "+date.getYear());
	
	LocalDateTime stime = LocalDateTime.now();
	System.out.println(stime);
	
	LocalTime dat = LocalTime.now(ZoneId.of("Asia/Singapore"));
	System.out.println(dat);
	
	DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
	System.out.println(stime.format(pattern));
//		for (String s : ZoneId.getAvailableZoneIds()) 
//		{
//			System.out.println(s);
//			
//		}
		
		
}
}
