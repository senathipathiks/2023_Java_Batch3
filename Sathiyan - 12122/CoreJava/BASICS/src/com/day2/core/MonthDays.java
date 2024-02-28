package com.day2.core;

import java.util.Scanner;

public class MonthDays {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("1.January\n2.Feburary\n3.March\n4.April\n5.May\n6.June\n7.July\n8.August\n9.September\n10.October\n11.November\n12.December");
		int input=sc.nextInt();
		
		switch (input) {
		case 1:System.out.println("31 days");
			break;
		case 2:System.out.println("28 days");
			break;
		case 3:System.out.println("31 days");
			break;
		case 4:System.out.println("30 days");
			break;
		case 5:System.out.println("31 days");
			break;
		case 6:System.out.println("30 days");
			break;
		case 7:System.out.println("31 days");
			break;
		case 8:System.out.println("31 days");
			break;
		case 9:System.out.println("30 days");
			break;
		case 10:System.out.println("31 days");
			break;
		case 11:System.out.println("30 days");
			break;
		case 12:System.out.println("31 days");
			break;

		default:System.out.println("Invalid input");
			break;
		}

	}

}
