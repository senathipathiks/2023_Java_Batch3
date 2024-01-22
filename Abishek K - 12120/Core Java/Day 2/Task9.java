//Write a Java program that takes a number from the user and generates an integer between 1 and 7. 
//It displays the weekday name.

package com.day;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
	String[] Weekday = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Weekday no: ");
	int day=sc.nextInt();
	int d1=day-1;
	System.out.println(Weekday[d1]);
	

}
}