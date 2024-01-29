package com.coreday6;


import java.util.regex.*;

@SuppressWarnings("serial")
class InvalidPasswordFormat extends Exception{
	
	public InvalidPasswordFormat(String msg) {
		super(msg);
	}
}

class PasswordFormat {
	
	String passRegex = "^(?=.*[a-z0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,20}$";
	
	Pattern pattern = Pattern.compile(passRegex);
	
	public PasswordFormat(String password) throws InvalidPasswordFormat {
		
		if(!pattern.matcher(password).matches())
			throw new InvalidPasswordFormat("Invalid Password : Please Provide a Valid Password");
		else
			System.out.println("Password is valid");
		
	}
}

public class CustomExceptionExample4 {

	public static void main(String[] args) {
		
		try {
			@SuppressWarnings("unused")
			PasswordFormat pass = new PasswordFormat("Sanjaykhanna");
		} catch (InvalidPasswordFormat e) {
			System.out.println(e.getMessage());
		}
		

	}

}
