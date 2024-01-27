package Day6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateMonth {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		System.out.println("The month is: " + date.getMonthValue());
		System.out.println("The year is: " + date.getYear());
		System.out.println("The Month is: " + date.getMonth());
		System.out.println("The day of the month is: " + date.getDayOfYear());

		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
		System.out.println(date.format(pattern));
		//System.out.println(pattern);
	}

}
