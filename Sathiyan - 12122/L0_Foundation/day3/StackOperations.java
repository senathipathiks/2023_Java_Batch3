package com.day3;

import java.util.Stack;

public class StackOperations {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack);//[10, 20, 30]
		stack.pop();//Last Element is Removed
		System.out.println(stack);//[10, 20]
		System.out.println(stack.peek());//20
		System.out.println(stack);//[10, 20]
		
		for (int i = stack.size()-1; i >=0; i--) {
			System.out.println(stack.pop());	
		}
		
		stack.push(40);
		stack.push(50);	
		
		System.out.println();//Creates one empty Line
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
			
		}
	}
}
