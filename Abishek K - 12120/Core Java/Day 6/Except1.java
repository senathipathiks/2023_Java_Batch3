package com.day6;

class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		super(msg);
	}
}
class ElectionCommission{
	ElectionCommission(int age) throws InvalidAgeException{
		
		if(age<18 || age>110) {
			throw new InvalidAgeException("Not Eligible to Vote");
		}
		else {
			System.out.println("Welcome to Election Commission of India");
		}
	}
}
public class Except1 {

	public static void main(String[] args) {
		try {
			ElectionCommission obj = new ElectionCommission(13);
		}
		catch(InvalidAgeException ex) {
			System.out.println(ex.getMessage());
		}
	

	}

}
