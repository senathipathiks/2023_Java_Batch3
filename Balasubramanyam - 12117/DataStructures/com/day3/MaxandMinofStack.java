package com.day3;

import java.util.Stack;

public class MaxandMinofStack {

	public static void main(String[] args) {
		Stack<Integer>stack=new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(50);
		stack.push(60);
		stack.push(40);
		stack.sort(null);
		System.out.println(stack);
		System.out.println("teh min num is: "+stack.firstElement());
		System.out.println("the max num is: "+stack.peek());
		
		
		
		
		
	}

}
