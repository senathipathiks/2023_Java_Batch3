package com.day22;

import java.util.Scanner;

public class FindDaysMonth {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Month Name [3chars]");
		String mon = sc.next();
		switch(mon) {
		case "jan":System.out.println("No of Days : 31");break;
		case "feb":System.out.println("It's Leap year means No of Days : 29 \nIt's Not Leap year means No of days : 28");
		case "mar":System.out.println("No of Days : 31");break;
		case "apr":System.out.println("No of Days : 30");break;
		case "may":System.out.println("No of Days : 31");break;
		case "jun":System.out.println("No of Days : 30");break;
		case "jul":System.out.println("No of Days : 31");break;
		case "aug":System.out.println("No of Days : 31");break;
		case "sep":System.out.println("No of Days : 30");break;
		case "oct":System.out.println("No of Days : 31");break;
		case "nov":System.out.println("No of Days : 30");break;
		case "dec":System.out.println("No of Days : 31");break;
		default:System.out.println("Invalid month");
		}

	}

}
