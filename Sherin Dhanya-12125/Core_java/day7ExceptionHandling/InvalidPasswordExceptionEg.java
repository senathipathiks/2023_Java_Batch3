package com.day7ExceptionHandling;
class InvalidPasswordException extends Exception{
	InvalidPasswordException(String msg){
		super(msg);
	}
}
class PasswordValidation{
	PasswordValidation(String password)throws InvalidPasswordException
	{
		if(password.length()<=6 || password.length()>=8) {
			throw new InvalidPasswordException("Password is incorrect");
		}
		else {
			System.out.println("Password is correct");
		}
	}
}
public class InvalidPasswordExceptionEg {

	public static void main(String[] args) {
try {
	PasswordValidation obj = new PasswordValidation("sherindhanya");
}
catch (InvalidPasswordException e) {
	System.out.println(e.getMessage());
}
	}

}
