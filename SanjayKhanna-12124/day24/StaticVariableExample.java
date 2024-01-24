package com.day24;

class StaticExample{
	static int count;
	
	static int increment() {
		return ++count;
	}
}

public class StaticVariableExample {

	public static void main(String[] args) {
		System.out.println("First time : "+StaticExample.increment());
		System.out.println("Second time : "+StaticExample.increment());
		System.out.println("Third time : "+StaticExample.increment());
		System.out.println("Fourth time : "+StaticExample.increment());
		
	}

}
