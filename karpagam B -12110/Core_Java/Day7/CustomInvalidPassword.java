package Com.Day7;

class InvalidPasswordFormat extends Exception{
	public InvalidPasswordFormat(String msg) {
		super(msg);
	}
}

class PasswordContains{
	public PasswordContains(String pwd)throws InvalidPasswordFormat {
		if(pwd.length()<=6 || pwd.length()>=10) {
			throw new InvalidPasswordFormat("Password is incorrect..please put password upto 6 to 10 character ");
			}
		else {
			System.out.println("Good to goo..");
		}
	}
}
public class CustomInvalidPassword {

	public static void main(String[] args) {
		try {
		 PasswordContains obj1=new PasswordContains("kaviy");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
