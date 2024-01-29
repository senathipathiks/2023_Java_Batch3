package com.day7.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern; 

class InvalidPasswordException extends Exception {
	public InvalidPasswordException (String message) {
		super (message);
	}
}

class Password{
	Password (String password) throws InvalidPasswordException {
		String regex = "^ (?=.* [0-9]) (?=.* [a-z]) (?=.* [A-Z]) (?=.* [@#$%^&\\+=]) (?=\\S+$). {8,20}$";
		Pattern p = Pattern.compile (regex);
		Matcher m = p.matcher (password);
		
		if (!m.matches()) {
			throw new InvalidPasswordException ("Enter a Valid password");}
		else {
			System.out.println("Password Accepted");
			}
	}
		
}


public class InvaliPassWord
	{
	public static void main(String[] args) 
	{
	try 
	{
		Password obj=new Password("Sath");
	} 
	catch (InvalidPasswordException e) 
	{
		System.out.println(e.getMessage());
	}
		
	}
}
