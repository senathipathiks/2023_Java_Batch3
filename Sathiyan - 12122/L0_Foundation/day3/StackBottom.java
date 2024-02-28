package com.day3;

import java.util.*;

public class StackBottom {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		System.out.println(stack);
		System.out.println("Bottom Element in a Stack is : "+stack.get(0));
		System.out.println("Top element in a stack is : "+ stack.peek());		
	}
}
