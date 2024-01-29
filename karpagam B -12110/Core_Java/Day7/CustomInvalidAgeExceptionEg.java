package Com.Day7;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
    super(msg);
}
}
class ElectionCommission
{
	public ElectionCommission(int age) throws InvalidAgeException {
		
		if (age<18 || age >110) {
			throw new InvalidAgeException("Not eligible to vote !!");
		}
		else {
			System.out.println("Welcome to Election Commission of India");
		}
	}
}
public class CustomInvalidAgeExceptionEg {

	public static void main(String[] args) {
		try {
			ElectionCommission obj1=new ElectionCommission(17);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
			
		

	}

}
