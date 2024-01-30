package com.day6;

class InvalidNo extends Exception{
	
	InvalidNo(String msg){
		super(msg);
	}
}

public class Except {

	public static void main(String[] args) {
		
		int num1 = 110;
		try {
			if(num1>100) {
				throw new InvalidNo("Number is Invalid: Provide the valid number 1 to 100");
			}
		}
		catch(InvalidNo ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println("custom Generated Exception");
		
	}
}
