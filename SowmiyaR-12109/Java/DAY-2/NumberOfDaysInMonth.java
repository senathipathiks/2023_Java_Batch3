package Day2;

//10. Write a Java program to find the number of days in a month.
import java.util.Scanner;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month number:");
		int month = sc.nextInt();
//		System.out.println("Enter the year");
//		int year = sc.nextInt();
		int nomonth = 0;
		String MonthName = null;
		switch (month) {
		case 1:
			MonthName = "January";
			nomonth = 31;
			break;
		case 2:
			MonthName = "February";
			nomonth = 29;
			break;
		case 3:
			MonthName = "March";
			nomonth = 31;
			break;
		case 4:
			MonthName = "April";
			nomonth = 30;
			break;
		case 5:
			MonthName = "May";
			nomonth = 31;
			break;
		case 6:
			MonthName = "June";
			nomonth = 30;
			break;
		case 7:
			MonthName = "July";
			nomonth = 31;
			break;
		case 8:
			MonthName = "Augest";
			nomonth = 31;
			break;
		case 9:
			MonthName = "september";
			nomonth = 30;
			break;
		case 10:
			MonthName = "october";
			nomonth = 31;
			break;
		case 11:
			MonthName = "November";
			nomonth = 30;
			break;
		case 12:
			MonthName = "December";
			nomonth = 31;
			break;

		default:
			System.out.println("Enter the valid month number");

		}
		System.out.println("month name is "+MonthName+" and the number of days in month is " + nomonth);

	}

}
