package com.day6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeEg1 {

	public static void main(String[] args) {
		
	LocalDateTime date=LocalDateTime.now();
	
	//DateTimeFormatter pattern=DateTimeFormatter.ofPattern("yyy-dd-MM hh:mm:ss");
	
	DateTimeFormatter pattern=DateTimeFormatter.ofPattern("dd-mm-yyy HH:mm:ss");
	System.out.println(date.format(pattern));
	System.out.println(pattern);
	}

}
