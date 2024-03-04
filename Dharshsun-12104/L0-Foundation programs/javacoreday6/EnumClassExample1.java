package com.javacoreday6;

public class EnumClassExample1 {

	public static void main(String[] args) {

		enum Days{mon,tue,wed,thus,fri,sat,sun}
		
		Days day = Days.fri;
		
		switch(day) {
		case sat,sun -> System.out.println("Alarm @8:00am");
		case mon ->System.out.println("Alarm @5:30");
		default -> System.out.println("Alarm @6:00am");
		}

	}

}