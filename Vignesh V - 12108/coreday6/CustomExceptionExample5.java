package com.coreday6;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("serial")
class InvalidMonthException extends Exception {

	public InvalidMonthException(String msg) {
		super(msg);
	}
}

class MonthCheck {
	List<String> monthList = Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
			"Dec");

	public MonthCheck(String mon) throws InvalidMonthException {
		if (!monthList.contains(mon))
			throw new InvalidMonthException("Invalid Month : Please provide a valid month");
		else
			System.out.println("Valid Month : " + mon);

	}
}

public class CustomExceptionExample5 {
	public static void main(String[] args) {

		try {
			@SuppressWarnings("unused")
			MonthCheck obj = new MonthCheck("Dec");
		} catch (InvalidMonthException e) {
			System.out.println(e.getMessage());
		}

	}

}
