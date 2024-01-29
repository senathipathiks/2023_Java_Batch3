package com.day7;

class InvalidMonthException extends Exception{
	
	public InvalidMonthException(String msg) {
		super(msg);
	}
}


class MonthCheck{
	
	public MonthCheck(int month) throws InvalidMonthException {
		try {
			
		if(month < 0 || month > 12) {
			
			throw new InvalidMonthException("Enter the valid month 1-12");
		}
		} catch (InvalidMonthException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		
	}
}

public class InvalidMonthEx {

	public static void main(String[] args) throws InvalidMonthException {
		
		MonthCheck m = new MonthCheck(13);
		

	}

}
