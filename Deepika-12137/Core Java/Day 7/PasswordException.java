package com.day7;

class InvalidPassword extends Exception{
	InvalidPassword(String pass){
		super(pass);
	}
}

class Password{
	Password (String password) throws InvalidPassword
	{
		
		 if  (!((password.length() >= 8) 
	             && (password.length() <= 15))) { 
	           throw new InvalidPassword("Password created"); 
	       }
		 else {
			 System.out.println("Invalid password length");
		 }
	 
	 if  (!(password.contains("@") || password.contains("#") 
             || password.contains("!") || password.contains("~") 
             || password.contains("$") || password.contains("%") 
             || password.contains("^") || password.contains("&") 
             || password.contains("*") || password.contains("(")  
             || password.contains("+") || password.contains("/") 
             || password.contains(">") || password.contains("?") 
             || password.contains("|"))) { 
           throw new InvalidPassword("Special character accepted"); 
	}
	 else {
		 System.out.println("Password not accepted");
	 }
}
public class PasswordException {

	public static void main(String[] args) {
		
                try {
                	Password obj=new Password("Deepika@12");
                }
                catch (InvalidPassword p) {
                	System.out.println(p.getMessage());
                }
	}

}}
