package com.day7;

class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		super(msg);
	}
}

class ElectionCommision{
	ElectionCommision(int age) throws InvalidAgeException{
		if(age<18 || age>110) {
			throw new InvalidAgeException("Not Eligible to vote");
		}
		else {
			System.out.println("Welcom to election commision");
		}
	}
}
public class ExceptionDemo1 {
public static void main(String[] args) {
	try {
		ElectionCommision obj=new ElectionCommision(13);
		}
	catch(InvalidAgeException e) {
		System.out.println(e.getMessage());
	}
}
}
