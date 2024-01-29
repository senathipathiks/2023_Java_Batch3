package com.day7;

class InvalidPasswordException extends Exception{
	public InvalidPasswordException(String msg) {
		super(msg);
	}
}

class PasswordValidation {
	public PasswordValidation(String pwd) throws InvalidPasswordException{
		if(pwd.length()<=16 || pwd.length()>=20) {
			throw new InvalidPasswordException("Incorrect Password");
		}
		else 
			System.out.println("Password Entered Successfully");
		
	}
}

public class CustomeInvalidPasswordFormat {

	public static void main(String[] args) {
		try {
			PasswordValidation obj=new PasswordValidation("Vinolisha084646");
		}
		catch(InvalidPasswordException e) {
			System.out.println(e.getMessage());
		}
			
		

	}

}
