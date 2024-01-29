package com.day7;
import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidMonthException extends Exception{
	public InvalidMonthException(String msg) {
		super(msg);
	}
}

class InvalidMonth {
	public InvalidMonth(int mon) throws InvalidMonthException {
		if(mon<=0 || mon>12) {
			throw new InvalidMonthException("There is no month");
		}
		else {
			System.out.println("Valid Month");
		}
	}
}

public class CustomInvalidMonthException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter the month");
			int month=sc.nextInt();
			InvalidMonth n1=new InvalidMonth(month);
		}
		catch(InvalidMonthException e) {
			System.out.println(e.getMessage());
		}

	}

}
