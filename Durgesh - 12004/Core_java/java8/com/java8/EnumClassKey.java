package com.java8;

public class EnumClassKey {

	public static void main(String[] args) {
		enum Days{Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}
		
		Days day = Days.Sunday;
		
		switch (day) {
		
		case Monday-> System.out.println("Wake me at 7 AM");
		
		case Saturday, Sunday -> System.out.println("Wake me at 9 AM");
		
		default -> System.out.println("Week days wake me at 6AM");
	
		}	
	}
}
