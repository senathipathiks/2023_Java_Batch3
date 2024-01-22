//Write a Java program to find the number of days in a month.

package com.day;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		System.out.println("Enter the Month: ");
		Scanner sc = new Scanner(System.in);
		int month=sc.nextInt();
		System.out.println("Enter the Year: ");
		int year=sc.nextInt();
		
		switch(month) {
		case 1:
			System.out.println("January");
			System.out.println("Days: 31");
			break;
		case 2:
			System.out.println("Feburary");
			if(year%4==0) {
				System.out.println("Days: 29");
			}
			else {
				System.out.println("Days: 28");
			}
			break;
		case 3:
			System.out.println("March");
			System.out.println("Day 31");
			break;
		case 4:
			System.out.println("April");
			System.out.println("Day 30");
			break;	
		case 5:
			System.out.println("May");
			System.out.println("Day 31");
			break;	
		case 6:
			System.out.println("June");
			System.out.println("Day 30");
			break;	
		case 7:
			System.out.println("July");
			System.out.println("Day 31");
			break;	
		case 8:
			System.out.println("August");
			System.out.println("Day 30");
			break;	
		case 9:
			System.out.println("September");
			System.out.println("Day 31");
			break;	
		case 10:
			System.out.println("October");
			System.out.println("Day 30");
			break;	
		case 11:
			System.out.println("November");
			System.out.println("Day 30");
			break;	
		case 12:
			System.out.println("December");
			System.out.println("Day 31");
			break;	
		default:
			System.out.println("Enter the valid month");
		}

	}

}
