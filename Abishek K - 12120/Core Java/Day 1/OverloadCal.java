package com.day1;

class Cal{
	int a;
	float b;
	
	void multiplication(int a) {
		this.a=a;
		System.out.println("Integer input: " + a);
	}
	void multiplication(float b) {
		this.b=b;
		System.out.println("Float input: "+b);
	}
	void multiplication(int a,float b) {
		this.a=a;
		this.b=b;
		System.out.println("Integer: "+a+"Float: "+b);
	}
}

public class OverloadCal {

	public static void main(String[] args) {
		Cal obj = new Cal();
		obj.multiplication(5,8.0f);

	}

}
