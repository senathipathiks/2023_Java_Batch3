package com.Day7;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(msg);
	}
}
class Election{
	public Election(int age) throws InvalidAgeException{
		if(age<18 || age>100) {
			throw new InvalidAgeException("Not Eligible for Vote");
		}
		else {
			System.out.println("Welcome to Vote");
		}
	}
}
public class ExceptionDemo1 {
	public static void main(String[] args) {
		try{
			Election obj = new Election(13);
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
