package com.javacoreday7;

@SuppressWarnings("serial")
class InvalidMonthException extends Exception {
    public InvalidMonthException(String message) {
        super(message);
    }
}

class Month {
    private int month;

    public Month(int month) throws InvalidMonthException {
    	this.month=month;
        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Invalid month: " + month);
        }
        else {
        	System.out.println(month+" : is Valid");
        }
    }

    public int getMonth() {
        return month;
    }
}

public class MonthException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Month obj=new Month(12);
		}
		catch(InvalidMonthException e) {
			System.out.println(e.getMessage());
	}

}
}
