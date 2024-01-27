package com.Basic;
import java.util.*;
public class DisplaysWeekdayName {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 boolean quit = false;
     do {
    System.out.println("Enter the WeekDay Number: ");
	int WeekDayNumber = sc.nextInt();
	switch(WeekDayNumber) {
	case 1 : System.out.println("Monday"); break;
	case 2 : System.out.println("Tuesday"); break;
	case 3 : System.out.println("Wednesday");break;
	case 4 : System.out.println("Thursday");break;
	case 5 : System.out.println("Friday");break;
	case 6 : System.out.println("Saturday");break;
	default :System.out.println("Sunday");
	}}
     while(!quit);
	 System.out.println("Do you continue");
}
}
