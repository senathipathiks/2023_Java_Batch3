package com.day7;

class InvalidNo extends Exception{
	InvalidNo(String msg){
		super(msg);
	}
}

public class CustomeException {

	public static void main(String[] args) {
		int num1=101;
		try{
			if(num1>100) 
				throw new InvalidNo("Number is invalid:Provide is invalid number between 1 to 100");
			}
			catch(InvalidNo e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Custom Generated Exception");
		
	}
	

}

