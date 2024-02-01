package rel.edu.day6.CustomException;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

class InvalidMonth extends Exception {

	@Override
	public String getMessage() {

		return "Entered month is invalid...!";
	}

}

public class InvalidMonthDriver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the date to validate(yyy,mm,dd)");
		
		DateTimeFormatter pat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		try {
			LocalDate d = LocalDate.parse(sc.next(),pat);
			int month = d.getMonthValue();
			System.out.println(month);
			if(month > 12 || month < 1)
				throw new InvalidMonth();
		} catch (InvalidMonth e) {
			System.out.println(e.getMessage());
		}
	}
}
