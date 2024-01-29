package com.coreday6;

class InvalidNo extends Exception{
	
	InvalidNo(String msg){
		super(msg);
	}
}

public class CustomExceptionExample {
	public static void main(String[] args) {
		int num1=110;
		try {
			
			if(num1>100)
				
				throw new InvalidNo("Number is invalid : provide the valid number between 1 t0 100");
			
			
		} catch (InvalidNo e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("custom generated exception");
		
	}

}
