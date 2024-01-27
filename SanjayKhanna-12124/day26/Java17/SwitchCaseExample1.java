package com.day26.Java17;

public class SwitchCaseExample1 {

	public static void main(String[] args) {
		
		String day = "Sunday";
		
		switch(day) {
		case "Saturday","Sunday" -> System.out.println("Alarm @8:00am");
		case "Monday" ->System.out.println("Alarm @5:30");
		default -> System.out.println("Alarm @6:00am");
		}

	}

}
