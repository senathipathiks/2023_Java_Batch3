package com.java3;

import java.util.Stack;

public class SampleStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(20);
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
		
		while(!stack.isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();
		}
		
		
	}

}
