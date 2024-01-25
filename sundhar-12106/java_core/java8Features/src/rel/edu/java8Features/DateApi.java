package rel.edu.java8Features;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateApi {
	
	public static void main(String[] args) {
		
		LocalDateTime dat = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(dat);
	}

}
