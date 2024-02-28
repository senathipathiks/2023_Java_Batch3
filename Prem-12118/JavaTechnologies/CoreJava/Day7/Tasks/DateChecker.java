package Day7.Tasks;

import java.util.Arrays;
import java.util.List;

class InvalidDateFormat extends Exception {

	public InvalidDateFormat(String msg) {
		super(msg);
	}
}

class DateChecking {
	List<String> monthList = Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
			"Dec");

	public DateChecking(String date) throws InvalidDateFormat {

		String[] str = date.split("-");
		if ((Integer.parseInt(str[0]) <= 31 && Integer.parseInt(str[0]) >= 0) && monthList.contains(str[1])
				&& (Integer.parseInt(str[2]) >= 0))
			System.out.println("Valid Date : " + date);
		else
			throw new InvalidDateFormat("Invalid Date Format : Please Provide in DD-MMM-YYYY");
	}
}

public class DateChecker {

	public static void main(String[] args) {
		try {
			 
			DateChecking obj = new DateChecking("23-Jan-2023");
		} catch (InvalidDateFormat e) {
			System.out.println(e.getMessage());
		}
	}
}
