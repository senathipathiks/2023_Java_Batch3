package com.day7;

class InvalidNo extends Exception{
	InvalidNo(String msg){
		super(msg);
	}
}
public class CustomException {
public static void main(String[] args) {
	int num1=110;
	try {
		if(num1>100)
			throw new InvalidNo("Number is invalid:enter the valid number");
		
	}
	catch(InvalidNo e){
		System.out.println(e.getMessage());
		
	}
	System.out.println("custom generated exception");
}
}
