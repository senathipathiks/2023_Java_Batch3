package rel.edu.day6.CustomException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class InvalidDateException extends Exception {

	@Override
	public String getMessage() {

		return "Entered date is Invalid";
	}

}

public class InvalidDateFormatDriver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the date to validate(dd-mmm-yyyy)");
		
		String usr_date = sc.next();
		
		DateTimeFormatter pat = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//		System.out.println(usr_date.for);
	}

}
