package Com.Day6;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateApi {

	public static void main(String[] args) {	
		
	
//
//      for(String s:ZoneId.getAvailableZoneIds()) {
//		System.out.println(s);
//      }
		
		
       System.out.println("------------------------------");

		LocalDateTime date=LocalDateTime.now();
		
		DateTimeFormatter pattern=DateTimeFormatter.ofPattern("DD-MM-YYYY hh:mm:ss");
		System.out.println(date.format(pattern));
		
		System.out.println("------------------------------");
		
		System.out.println("The month is:"+date.getMonthValue());
		System.out.println("The day of the month is:"+date.getDayOfYear());
		System.out.println("The year is:"+date.getYear());
	
		
		

	}

}
