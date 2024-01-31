package com.java8;

public class AdvSwitchCase {

	public static void main(String[] args) {
		String days = "Sunday";
		String result = " ";
		
//		switch (days) {
//		case "Saturday", "Sunday"-> System.out.println("9 AM");
//		
//		case "Monday" -> System.out.println("7 AM");
//		
//		default -> System.out.println("10 AM");
//		}
		
		result = switch (days) {
		case "Saturday", "Sunday": yield "10 AM";
		
		case "Monday" : yield "8 AM";
		
		default: yield(" 6 AM");
		};
		System.out.println(result);
	}

}
