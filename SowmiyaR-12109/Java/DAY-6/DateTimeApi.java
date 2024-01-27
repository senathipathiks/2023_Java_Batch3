package Day6;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeApi {

	public static void main(String[] args) {
		System.out.println("current Time");
		 LocalTime time=LocalTime.now();
		 System.out.println(time);
		System.out.println("...................");
		 System.out.println("Date and Time");
		LocalDateTime systime=LocalDateTime.now();
		System.out.println(systime);

		System.out.println("...................");
		LocalTime dat = LocalTime.now(ZoneId.of("Canada/Saskatchewan"));
		System.out.println(dat);

//		for (String s : ZoneId.getAvailableZoneIds()) {
//			System.out.println(s);
//		}
		
		

	}

}
