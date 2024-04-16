package com.sample.junit;

@SuppressWarnings("serial")
class MinorAgeException extends Exception{
	public MinorAgeException(String message) {
		super(message);
	}
}

@SuppressWarnings("serial")
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}

public class Voter {
	String msg="";
	
	String checkAge(int age) throws InvalidAgeException, MinorAgeException {
		if(age<0) {
			throw new InvalidAgeException("Negative Age");
		}else if (age < 10){
			throw new MinorAgeException("Minor Age Exception");
		}else if (age >= 18) {
			msg="Eligible";
		}else if (age <18 && age > 10) {
			msg="Not Eligible";
		}
		return msg;
		
	}
}


