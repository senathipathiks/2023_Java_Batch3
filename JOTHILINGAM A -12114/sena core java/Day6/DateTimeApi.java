package Day6;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeApi {

	public static void main(String[] args) {
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		
		
		
		LocalDateTime date=LocalDateTime.now();
		System.out.println(date);
		
		System.out.println("the month is            : "+date.getMonthValue());
		System.out.println("the day of the month is : "+date.getDayOfYear());
		System.out.println("the month is            : "+date.getYear());
		System.out.println("the month is            : "+date.getMonth());
		
//		LocalTime dat=LocalTime.now(ZoneId.of("Europe/Moscow"+ ""));
//		System.out.println(dat);
		
//		for(String s: ZoneId.getAvailableZoneIds()) {
//			System.out.println(s);
//		}
	}

}
