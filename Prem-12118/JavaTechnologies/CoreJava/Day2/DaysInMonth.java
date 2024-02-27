package Day2;

import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the month (1-12): ");
		int month = scanner.nextInt();

		if (month < 1 || month > 12) {
			System.out.println("Invalid month input. Month must be between 1 and 12.");
			
		}

		switch (month) {
		case 1:
			System.out.println("Number of days in the month:31days ");
			System.out.println("The month is January");
			break;
		case 3:
			System.out.println("Number of days in the month:31days ");
			System.out.println("The month is March");
			break;

		case 5:
			System.out.println("Number of days in the month:31days ");
			System.out.println("The month is April");
			break;
		case 7:
			System.out.println("Number of days in the month:31days");
			System.out.println("The month is July");
			break;

		case 8:
			System.out.println("Number of days in the month:31days");
			System.out.println("The month is August");
			break;
		case 10:
			System.out.println("Number of days in the month:31days");
			System.out.println("The month is October");
			break;
		case 12:
			System.out.println("Number of days in the month:31days");
			System.out.println("The month is December");
			break;
		case 4:
			System.out.println("Number of days in the month:30days");
			System.out.println("The month is April");
			break;
		case 6:
			System.out.println("Number of days in the month:30days");
			System.out.println("The month is June");
			break;

		case 9:
			System.out.println("Number of days in the month:30days");
			System.out.println("The month is September");
			break;

		case 11:
			System.out.println("Number of days in the month:30days");
			System.out.println("The month is November");
			break;

		case 2:
			System.out.println("Number of days in the month: 28days");
			System.out.println("The month is February");
			break;

		default:
			System.out.println("Enter valid input...!");
		}
	}
}
