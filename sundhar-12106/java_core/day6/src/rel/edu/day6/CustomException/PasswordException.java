package rel.edu.day6.CustomException;

public class PasswordException extends Throwable{

	@Override
	public String getMessage() {
		return "Please enter valid password format";
	}
	
	

}
