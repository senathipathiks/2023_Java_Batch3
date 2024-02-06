package com.day21;

public class Calculator {
	
	int multiply(int num1,int num2) {
		return num1*num2;
	}
	
	float multiply(float num1,float num2) {
		return num1*num2;
	}
	
	float multiply(int num1,float num2) {
		return num1*num2;
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println("Integer Function : "+obj.multiply(5, 6));
		System.out.println("Float Function : "+obj.multiply(5f, 6f));
		System.out.println("Mixed Function : "+obj.multiply(5, 6f));
	}

}
