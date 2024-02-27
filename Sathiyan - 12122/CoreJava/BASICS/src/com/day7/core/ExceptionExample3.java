package com.day7.core;

class InvalidAge extends Exception{
	InvalidAge(String msg){
		super(msg);
	}
}

class ElectionCommision{
	ElectionCommision(int age) throws InvalidAge
	{
		if (age<18 || age >110) {
			throw new InvalidAge("Not elegible to vote");
		} else {
			System.out.println("Welcome to Election commision of India");
		}
	}
}
public class ExceptionExample3 {
	public static void main(String[] args) {
		try {
			ElectionCommision obj=new ElectionCommision(19);
		} catch (InvalidAge e) {
			System.out.println(e.getMessage());
		}
	}
}
