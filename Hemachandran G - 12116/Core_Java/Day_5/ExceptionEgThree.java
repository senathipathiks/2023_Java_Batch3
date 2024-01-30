package Day_5;

class InvalidAgeException extends Exception{
	InvalidAgeException(String str){
		super(str);
	}
}

class ElectionCommison{
	ElectionCommison(int age) throws InvalidAgeException{
		if (age<18 || age>100) {			
			throw new InvalidAgeException("Not Eligible to Vote !!");
			
		}
		else {
			System.out.println("Welcome to Election Commision of India ....! ! ");
		}
	}
}

public class ExceptionEgThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			ElectionCommison ec = new ElectionCommison(20) ;
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
			
		}

	}

}
