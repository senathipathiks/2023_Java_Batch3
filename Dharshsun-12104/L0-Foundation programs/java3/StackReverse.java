package com.java3;

import java.util.Stack;

public class StackReverse {
	public static void main(String args[]) {
	Stack<Integer> stack = new Stack<Integer>();
	stack.push(10);
	stack.push(20);
	stack.push(30);
	System.out.println(stack);
	

while(!stack.isEmpty()) {
	System.out.println(stack.peek());
	stack.pop();
	
}
	}
}
	


		


