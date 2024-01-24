// Write a Java program to find the number of days in a month.


package com.day2;
import java.util.Scanner;

public class findingDaysInMonth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int days=0;
		
		System.out.println("1.January\n2.Feburary\n3.March\n4.April\n5.May\n6.June\n7.July\n8.August\n9.September\n10.October\n11.November\n12.December");
		System.out.println("Enter the Month:");
		String month=sc.next();
		
		System.out.println("Enter the Year:");
		int year=sc.nextInt();
		
		switch(month) {
		
		case "January":{
			days=30;
			System.out.println(month+" "+"has"+ " " + days + " " + "days");
			break;
		}
		
		case "Feburary":{
			
			  if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                  days = 29;
              } else {
                   days = 28;
              }
			System.out.println(month+" "+"has"+ " " + days + " " + "days");
			break;
		}
		
		case "March":{
			days=31;
			System.out.println(month+" "+"has"+ " " + days + " " + "days");
			break;
		}
		
		case "April":{
			days=30;
			System.out.println(month+" "+"has"+ " " + days + " " + "days");
			break;
		}
		
		case "May":{
			days=31;
			System.out.println(month+" "+"has"+ " " + days + " " + "days");
			break;
		}
		
		case "June":{
			days=30;
			System.out.println(month+" "+"has"+ " " + days + " " + "days");
			break;
		}
		
		case "July":{
			days=31;
			System.out.println(month+" "+"has"+ " " + days + " " + "days");
			break;
		}
		
		case "August":{
			days=30;
			System.out.println(month+" "+"has"+ " " + days + " " + "days");
			break;
		}
		
		case "September":{
			days=31;
			System.out.println(month+" "+"has"+ " " + days + " " + "days");
			break;
		}
		
		case "October":{
			days=30;
			System.out.println(month+" "+"has"+ " " + days + " " + "days");
			break;
		}
		
		case "November":{
			days=31;
			System.out.println(month+" "+"has"+ " " + days + " " + "days");
			break;
		}
		
		case "December":{
			days=30;
			System.out.println(month+" "+"has"+ " " + days + " " + "days");
			break;
		}
		
		
		}
		
		

	}

}
