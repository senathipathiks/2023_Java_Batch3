package com.day6;

public class UpgradedSwitchCase {

	public static void main(String[] args) {
		String days="Wed";
		String result="";
		
//		switch(days) {
//		case "Saturday","Sunday" ->System.out.println("6 AM");
//		case "Monday" ->System.out.println("5 AM");
//		}
//		
		result=switch(days) {
		case "Saturday","Sunday":yield "6AM";
		case "monday":yield "7Pm";
		
		default: yield "5am";
		};
		
		System.out.println(result);

	}

}
