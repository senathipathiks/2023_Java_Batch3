package com.day2.core;
import java.util.*;
public class WeekDays {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number btwn 1 to 7 to know the day : ");
		int input=sc.nextInt();
		
		if (input==1) {
			System.out.println("Sunday");
		}else if (input==2) {
			System.out.println("Monday");
		} else if (input==3) {
			System.out.println("Tuesday");
		} else if (input==4) {
			System.out.println("Wednesday");
		} else if (input==5) {
			System.out.println("Thursday");
		} else if (input==6) {
			System.out.println("Friday");
		} else if (input==7) {
			System.out.println("Saturday");
		} else {
			System.out.println("Invalid Input");
		}
		
	}

}
