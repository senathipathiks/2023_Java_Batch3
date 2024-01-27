package com.day6;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class MonthApi {

	public static void main(String[] args) {
		LocalDateTime date=LocalDateTime.now();
		System.out.println("The month is: "+date.getMonth());
		System.out.println("The month is: "+date.getMonthValue());
		System.out.println("The Year is: "+date.getYear());
		System.out.println("The day of month is: "+date.getDayOfYear());
		

	}

}
