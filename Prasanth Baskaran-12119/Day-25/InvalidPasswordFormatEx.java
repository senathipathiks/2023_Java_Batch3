package com.day7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidPasswordFormat extends Exception{
	
	public InvalidPasswordFormat(String msg) {
		
		super(msg);
		
	}
}


class PassWordCheck{
	
	public PassWordCheck(String pass) throws InvalidPasswordFormat {
		
		String reg = "^(?=.*[0-9])"
		        + "(?=.*[a-z])(?=.*[A-Z])"
		        + "(?=.*[@#$%^&+=])"
		        + "(?=\\S+$).{8,20}$";
		
		Pattern pattern = Pattern.compile(reg);
		
		 Matcher m = pattern.matcher(pass);
		
		
		try {
			if (m.find()==true) {

				System.out.println("Password is Valid Format");
			}

			else {

				throw new InvalidPasswordFormat("Enter the Valid Password format");

			} 
		} catch (InvalidPasswordFormat e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
}


public class InvalidPasswordFormatEx {

	public static void main(String[] args) throws InvalidPasswordFormat {
		
		 PassWordCheck p = new PassWordCheck("Prasanth@123");
		
	
	}

}
