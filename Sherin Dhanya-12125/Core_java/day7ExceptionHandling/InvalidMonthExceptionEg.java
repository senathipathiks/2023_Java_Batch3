package com.day7ExceptionHandling;
class InvalidMonthException extends Exception{
	InvalidMonthException(String msg){
		super(msg);
	}
}
class MonthValidation{
	MonthValidation(int value) throws InvalidMonthException
	{
		if(value<=1 || value>=12) {
			throw new InvalidMonthException("Enter the month number between 1 to 12");
		}
		else {
			System.out.println("Correct value month");
		}
	}
}
public class InvalidMonthExceptionEg {

	public static void main(String[] args) {
try {
	MonthValidation obj = new MonthValidation(11);
}
catch(InvalidMonthException e) {
	System.out.println(e.getMessage());
}

	}

}
