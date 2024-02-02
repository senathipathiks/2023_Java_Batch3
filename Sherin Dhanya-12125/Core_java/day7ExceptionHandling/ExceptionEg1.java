package com.day7ExceptionHandling;
class InvalidNo extends Exception
{
	InvalidNo(String msg){
		super(msg);
	}
}
public class ExceptionEg1 {

	public static void main(String[] args) {
	int num1 = 10;
	try {
		if(num1>100)
			throw new InvalidNo("Number is invalid: Provide the valid number between 1 to 100");
	}
	catch(InvalidNo e) {
		System.out.println(e.getMessage());
	}
System.out.println("Custom generated Exception");
	}

}
