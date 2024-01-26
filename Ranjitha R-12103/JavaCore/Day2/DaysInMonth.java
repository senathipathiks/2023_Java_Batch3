//Write a Java program to find the number of days in a month
package Day2;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month number");
		int month = sc.nextInt();
		int NoofDaysInMonth=0;
		String MonthName="Unknown";
		switch (month) {
		case 1:
			MonthName = "January";
			NoofDaysInMonth = 31;
			break;
		case 2:
			MonthName = "February";
			NoofDaysInMonth = 28;
			break;
		case 3:
			MonthName="March";
			NoofDaysInMonth=31;
			break;
		case 4:
			MonthName="April";
			NoofDaysInMonth=30;
			break;
		case 5:
			MonthName="May";
			NoofDaysInMonth=31;
			break;
		case 6:
			MonthName="June";
			NoofDaysInMonth=30;
			break;
		case 7:
			MonthName="July";
			NoofDaysInMonth=31;
			break;
		case 8:
			MonthName="Augest";
			NoofDaysInMonth=31;
			break;
		case 9:
			MonthName="September";
			NoofDaysInMonth=30;
			break;
		case 10:
			MonthName="October";
			NoofDaysInMonth=31;
			break;
		case 11:
			MonthName="November";
			NoofDaysInMonth=30;
			break;
		case 12:
			MonthName="December";
			NoofDaysInMonth=31;
			break;
		}
		System.out.println("The number of "+month+"th month name is "+MonthName+" it contains "+NoofDaysInMonth+" days");
	}

}
