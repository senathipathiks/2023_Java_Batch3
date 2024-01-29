package com.day7.core;

class Invalid extends Exception{
	Invalid(String msg){
		super(msg);
	}
}

public class ExceptionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=900;
		try {
			if (num1>100) {
				throw new Invalid("Invalid number try to enter number between 1 to 100");
			}
		} catch (Invalid e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("Custom generated exception");
	}

}
