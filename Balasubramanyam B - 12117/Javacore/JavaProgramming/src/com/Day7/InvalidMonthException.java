package com.Day7;
@SuppressWarnings("serial")
class InvalidMonthException extends Exception {
    public InvalidMonthException(String msg) {
        super(msg);
    }

    static void processMonth(int month) throws InvalidMonthException {
    if (month < 1 || month > 12) {
        throw new InvalidMonthException("Invalid month: " + month);
    }
    else {
    	System.out.println(month+" : is valid month");
    }
    
}

public class InvalidMonthExceptiondemo {

	public static void main(String[] args) {
		try {
		    processMonth(11);
		} catch (InvalidMonthException e) {
		    System.out.println(e.getMessage());
		    // Handle the exception...
		}}}}


	


