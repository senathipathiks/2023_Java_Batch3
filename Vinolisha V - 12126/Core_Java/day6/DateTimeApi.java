package com.day6;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

import javax.xml.crypto.Data;

public class DateTimeApi {

	public static void main(String[] args) {
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		System.out.println();
		
		LocalDateTime sysTime=LocalDateTime.now();
		System.out.println(sysTime);
		
		System.out.println();
		
		LocalTime dat=LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(dat);
		
		System.out.println();
		
		LocalTime dat1=LocalTime.now(ZoneId.of("Europe/Moscow"));
		System.out.println(dat1);
		
		System.out.println();
		
		for(String s:ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
			
		}
		}

}
