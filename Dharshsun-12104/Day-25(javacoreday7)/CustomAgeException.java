package com.javacoreday7;

class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		super(msg);
	}
}
class ElectionCommision{
	ElectionCommision(int age) throws InvalidAgeException{
		if(age<18 || age>110) {
			throw new InvalidAgeException("Not eligibe to vote");
		}
		else {
			System.out.println("Welcome to election commsion of india");
		}
	}
	
}

public class CustomAgeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ElectionCommision obj=new ElectionCommision(13);
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
