package com.day4;

public class StaticVariable {
	static int count; //initialize count as 0
	
	static int increment() {
		return count++;
	}

	public static void main(String[] args) {
		System.out.println(StaticVariable.increment());//invoked by using class name

	}

}
