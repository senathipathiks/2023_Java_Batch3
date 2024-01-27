package Day6;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeApi {

	public static void main(String[] args) {

		LocalTime time = LocalTime.now();
		System.out.println("Current time is: " + time);

		LocalDateTime systime = LocalDateTime.now();
		System.out.println("System time format is: " + systime);

		LocalTime zotime = LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(zotime);

		System.out.println("**************************");

		for (String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}

	}

}
