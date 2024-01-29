package day3exception;

class CheckPassword extends Exception{
	public CheckPassword(String msg) {
		super(msg);
	}
}

class ValidPass{
	public ValidPass(String pass) throws CheckPassword {
		// TODO Auto-generated constructor stub
		if( !pass.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}$") )
          {
			throw new CheckPassword("Not valid Password ");
		}
		else {
			System.out.println("VALID Password");
		}
	}
}


public class CustomPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ValidPass v=new ValidPass("Kiruba@12345");
		} catch (CheckPassword e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 
		}
		
	}


