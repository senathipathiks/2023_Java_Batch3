package com.coreday3;

public class Staticvariable {

	static int increment() {
		int count=0;
		return count++;
	}
	public static void main(String[] args) {
		
		System.out.println(Staticvariable.increment());
		
		
	}

}
