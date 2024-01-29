package com.day7;

class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String msg) {
		
		super(msg);
	}
	
}


class ElectionCommission{
	
	public ElectionCommission(int age) throws InvalidAgeException {
		if(age < 18 || age >110) {
			
			throw new InvalidAgeException("Not Eligibale for vote !!!");
		}
		else 
		{
			System.out.println("Welcome to Election Commission of India");
		}
		
	}
}


public class AgeException {

	public static void main(String[] args) {
		
		try {
			ElectionCommission e = new ElectionCommission(19);
		} catch (InvalidAgeException e) {
			
			System.out.println(e.getMessage());
		}
		
	}

}
