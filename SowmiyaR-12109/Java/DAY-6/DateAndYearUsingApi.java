package Day6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndYearUsingApi {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		
		DateTimeFormatter pattern=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println(date.format(pattern));
		
//	System.out.println("the month is "+date.getMonthValue());
//	System.out.println("the day of the month is "+date.getDayOfYear());
//	System.out.println("the year is "+date.getYear());

	}

}
