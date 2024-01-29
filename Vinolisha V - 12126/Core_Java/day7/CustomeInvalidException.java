package com.day7;

class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String msg){
		super(msg);
	}
}

class ElectionCommision{
	public ElectionCommision(int age) throws InvalidAgeException {
		if(age<18 || age>110) {
			throw new InvalidAgeException("Not Eligible to vote");
		}
		else {
			System.out.println("Welcome to Election Commision of India");
		}
	}
}

public class CustomeInvalidException {

	public static void main(String[] args) {
		try{
			ElectionCommision obj=new ElectionCommision(19);
		}
		catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}
