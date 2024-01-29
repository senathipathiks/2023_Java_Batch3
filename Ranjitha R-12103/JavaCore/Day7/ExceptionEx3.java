package Day7;

class InvalidAgeException extends Exception {
	InvalidAgeException(String msg) {
		super(msg);
	}
}

class ElectionCommision {
	ElectionCommision(int age) throws InvalidAgeException {
		if (age < 18 || age > 110) {
			throw new InvalidAgeException("Not Eligible to vote");
		} else {
			System.out.println("Welcome to Election Commision of india");
		}
	}
}

public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
			ElectionCommision obj = new ElectionCommision(13);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

	}
}
