package Day6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatetimEx2 {

	public static void main(String[] args) {
		
		
		LocalDateTime date=LocalDateTime.now();
		
		DateTimeFormatter pattern=DateTimeFormatter.ofPattern("yyyy-MM-yyyy hh:mm:ss");
		System.out.println(date.format(pattern));
	}

}
