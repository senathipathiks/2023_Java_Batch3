package com.javacoreday7;

@SuppressWarnings("serial")
class InvalidNo extends Exception{
	InvalidNo(String msg){
		super(msg);
	}
}

public class CustomGeneratedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 110;
		try {
			if(num1>100) {
				throw new InvalidNo("Number is invalid:Provide the valid number");
			}
			
		}
		catch(InvalidNo e){
			{
				System.out.println(e.getMessage());
			
		}
			System.out.println("Custom generated exception");
	}

	}
}
