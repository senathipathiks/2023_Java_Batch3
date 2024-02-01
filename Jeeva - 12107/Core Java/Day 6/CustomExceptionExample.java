package com.coreDay6;

public class CustomExceptionExample {

	public static void main(String[] args) {
		

		int num = 111;
		
		try {
			if(num>100) {
				throw new InvalidNo("Number is Invalid, Provide the valid number btw 1-100");
			}
		}
		catch (InvalidNo e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Custom Generated Exception");
		
		
	}

}

class InvalidNo extends Exception
{
	InvalidNo(String msg){
		super(msg);
	}
}