package Day_6;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeApi {

	public static void main(String[] args) {
		
		LocalDateTime systime=LocalDateTime.now();
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
		System.out.println(systime.format(format));
		System.out.println(systime.getDayOfMonth());
		System.out.println(systime.getMonthValue());
		System.out.println(systime.getMonth());
		System.out.println(systime.getYear());
		System.out.println(systime.getDayOfYear());

		
	LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalTime dat=LocalTime.now(ZoneId.of("Indian/Reunion"));
		System.out.println(dat);
//		
//		for (String s : ZoneId.getAvailableZoneIds()) {-
//			System.out.println(s);
//		}

	}

}
