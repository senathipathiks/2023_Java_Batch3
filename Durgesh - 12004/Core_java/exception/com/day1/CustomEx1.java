package com.day1;

class InvalidNo extends Exception {
	InvalidNo(String msg){
		super(msg);
	}
}

public class CustomEx1 {

	public static void main(String[] args) {
		int num = 9;
		try {
			if(num > 100) 
				throw new InvalidNo("Number is invalid - Provide the number within 100");
		}
		catch (InvalidNo e) {
			System.out.println(e.getMessage());
		}
		System.out.println("This is a Custom Generated Exception");
	}

}
