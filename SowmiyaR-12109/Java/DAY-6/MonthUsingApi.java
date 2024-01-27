package Day6;

import java.time.LocalDateTime;

public class MonthUsingApi {

	public static void main(String[] args) {

		LocalDateTime date = LocalDateTime.now();

		System.out.println("The month is:" + date.getMonthValue());
		System.out.println("The month is:" + date.getMonth());
	}

}
