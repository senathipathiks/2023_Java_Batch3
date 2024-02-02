package Day2;
import java.time.YearMonth;
import java.util.Scanner;
public class NoOfDaysInMonth {

	public static void main(String[] args) {
		

		
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter year:");
		        int year = sc.nextInt();

		        System.out.println("Enter month:");
		        int month = sc.nextInt();

		        YearMonth yearMonthObject = YearMonth.of(year, month);
		        int daysInMonth = yearMonthObject.lengthOfMonth();

		        System.out.println("Number of days in month: " + daysInMonth);
		    }
		
	}


