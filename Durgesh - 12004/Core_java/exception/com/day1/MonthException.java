package com.day1;

class InvalidMonth extends Exception{
	InvalidMonth(String msg) {
		super(msg);
	}
}

class Ref {
	Ref(int month) throws InvalidMonth {
		if(month <1 || month >12)
			throw new InvalidMonth("The Given month is in valid");
		else 
			System.out.println("The Given Month is valid");
	}
}

public class MonthException {

	public static void main(String[] args) {
		try {
			Ref r = new Ref(9);
		}
		catch (InvalidMonth e) {
			System.out.println(e.getMessage());
		}
	}

}
