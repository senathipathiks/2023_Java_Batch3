package com.coreDay6;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		try {
			ElectionCommision e = new ElectionCommision(3);
		}
		catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

	}

}

class InvalidAgeException extends Exception
{
	InvalidAgeException(String msg){
		super(msg);
	}
}

class ElectionCommision{
	
	public ElectionCommision(int age) throws InvalidAgeException {
		if(age<18 || age>110) {
			throw new InvalidAgeException("Not Eligible to vote");
		}
		else {
			System.out.println("Welcome to Election Commision of Inda");
		}
	}
}