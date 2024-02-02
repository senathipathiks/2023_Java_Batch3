package com.coreDay9;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// 
		
		Stack<String> s = new Stack<String>();
		s.push("Lion ");
		s.push("Rhino ");
		s.push("Tiger ");
		s.push("Bull");
		
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		System.out.println(s.peek());
		
		System.out.println(s.get(0));

	}

}
