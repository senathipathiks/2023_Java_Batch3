package rel.edu.java8Features;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateApi {
	
	public static void main(String[] args) {
		
//		LocalTime dat = LocalTime.now(ZoneId.of("Europe/Moscow"));
//		System.out.println(dat);
		
		LocalDateTime date = LocalDateTime.now();
//		
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-dd-MM hh:mm:ss");
		System.out.println(date.format(pattern));
		System.out.println(pattern);
//		
//		System.out.println("the month is : "+date.getMonthValue());
//		System.out.println("the day of the month is "+date.getDayOfYear());
//		System.out.println("the year is  : "+date.getYear());
		
//		for (String s : ZoneId.getAvailableZoneIds()) {
//			System.out.println(s);
//		}
	}

}
