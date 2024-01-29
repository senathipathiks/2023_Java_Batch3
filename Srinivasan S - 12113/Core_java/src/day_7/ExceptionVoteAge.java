package day_7;

class InvalidAge extends Exception{
	public InvalidAge(String msg) {
		super(msg);
	}
}

class ElectionCommision {
	public ElectionCommision(int age) throws InvalidAge{
		if(age<18 ||age>100) {
			throw new InvalidAge("Not elligible to vote");}
		
		else {System.out.println("Welcome to Election commision of India\nYou are elligible for votting");}
	}
}
public class ExceptionVoteAge {

	public static void main(String[] args) {
		try {
			ElectionCommision ele=new ElectionCommision(17);
		} catch (InvalidAge e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Thanks by Election commision of India");
		}
	}

}
