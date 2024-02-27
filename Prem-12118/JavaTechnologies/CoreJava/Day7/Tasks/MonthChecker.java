package Day7.Tasks;

class InvalidMonthException extends Exception {
    public InvalidMonthException(String msg) {
        super(msg);
    }
}

class MonthCheck {
    public MonthCheck(int month) throws InvalidMonthException {
        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Enter a valid month between 1 and 12");
        }
        else {
        	System.out.println("Valid Month");
        }
    }
}

public class MonthChecker {
    public static void main(String[] args) {
        try {
            MonthCheck m = new MonthCheck(12);
        } catch (InvalidMonthException e) {
            System.out.println(e.getMessage());
        }
    }
}
