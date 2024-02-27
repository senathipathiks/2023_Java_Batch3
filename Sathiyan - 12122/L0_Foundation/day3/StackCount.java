package com.day3;

import java.util.Stack;

public class StackCount {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		System.out.println(stack.isEmpty());
		
		System.out.println(stack);
		int sum=0;
		int count=0;
		
		for (int i = 0; i < stack.size(); i++) {
			count++;
			sum=sum+stack.get(i);
		}		
		System.out.println("Number of element in Stack is : "+count);
		System.out.println("Total Value of Stack is : "+sum);
	}
}
