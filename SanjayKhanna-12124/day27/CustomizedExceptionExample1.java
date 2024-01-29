package com.day27;

@SuppressWarnings("serial")
class InvalidNo extends Exception{
	
	public InvalidNo(String msg) {
		super(msg);
	}
}
public class CustomizedExceptionExample1 {

	public static void main(String[] args) {
		
		int num = 101;
		try {
			if(num>100)
				throw new InvalidNo("Number is Invalid : Provide a number between 1 to 100");
		}catch(InvalidNo e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Custom Generated Exception");

	}

}
