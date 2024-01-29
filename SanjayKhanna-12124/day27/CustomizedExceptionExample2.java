package com.day27;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String msg) {
		super(msg);
	}
}

class ElectionCommision{
	
	public ElectionCommision(int age) throws InvalidAgeException {
		if(age<18 || age>100) {
			throw new InvalidAgeException("Not Eligible for Voting\r");
		}
		else
		{
			System.out.println("Welcome to Election Commision of India");
		}
	}
}

public class CustomizedExceptionExample2 {

	public static void main(String[] args) {
		
		try {
			@SuppressWarnings("unused")
			ElectionCommision obj = new ElectionCommision(17);
		}catch(InvalidAgeException e) {
			System.err.println("Error : "+e);
		}

	}

}
