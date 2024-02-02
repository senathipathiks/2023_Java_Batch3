package Day7;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(msg);
	}
}
class ElectionCommision{
	public ElectionCommision(int age) throws InvalidAgeException {
		
		if (age<18 || age >110) {
			throw new InvalidAgeException("Not Eligible for vote");
			
		}
		else {
			System.out.println("Welcome to Election Commision");
		}
		
		
	}
}

public class CustomAgeException {

	public static void main(String[] args) {
	
		try {
			ElectionCommision e=new ElectionCommision(13);
			
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
