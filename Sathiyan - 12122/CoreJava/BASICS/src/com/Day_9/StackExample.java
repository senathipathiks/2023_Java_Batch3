package com.Day_9;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String > ref=new Stack<String>();
		
		ref.push("Sathiyan");
		ref.push("Sathya");
		ref.push("Tamizh");
		ref.push("Siva");
		ref.push("Valli");
		
		System.out.println(ref);
		
		System.out.println(ref.pop());
		
		System.out.println(ref.peek());
		
		System.out.println(ref.get(0));
	}

}
