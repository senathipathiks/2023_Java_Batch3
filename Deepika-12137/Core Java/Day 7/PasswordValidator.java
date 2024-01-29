package com.day7;

class InvalidPasswords extends Exception{
	InvalidPasswords(String pass){
		super(pass);
	}
}

class Passwords{
	Passwords(String passowrd) throws InvalidPasswords{
		if  (((passowrd.length() >= 8) && (passowrd.length() <= 15)) && ((passowrd.contains("@") || passowrd.contains("#") 
	             || passowrd.contains("!") || passowrd.contains("~") 
	             || passowrd.contains("$") || passowrd.contains("%") 
	             || passowrd.contains("^") || passowrd.contains("&") 
	             || passowrd.contains("*") || passowrd.contains("(")  
	             || passowrd.contains("+") || passowrd.contains("/") 
	             || passowrd.contains(">") || passowrd.contains("?") 
	             || passowrd.contains("|")))) { 
	           throw new InvalidPasswords("Password created Successfully"); 
	       }
		 else {
			 System.out.println("Invalid password");
		 }
	}
	
}

public class PasswordValidator {

	public static void main(String[] args) {
		try {
			Passwords obj=new Passwords("Sathy^2345");
		} catch (InvalidPasswords e) {
			System.out.println(e.getMessage());
		}

	}

}
