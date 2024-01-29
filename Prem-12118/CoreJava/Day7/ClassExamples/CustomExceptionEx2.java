package Day7;
class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		super(msg);
	}
}
class ElectionCommission
{
	ElectionCommission(int age) throws InvalidAgeException{
		if (age<18 || age >110) {
			throw new InvalidAgeException("Age is Invalid");
		}
		else 
		{
			System.out.println("Welcome to Election Commission");
			
		}
	}
}
public class CustomExceptionEx2 {

	public static void main(String[] args) {
		
		 
		try {
			ElectionCommission obj= new ElectionCommission(20);
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
