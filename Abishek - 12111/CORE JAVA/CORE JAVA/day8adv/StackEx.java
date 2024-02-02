package com.day8adv;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(30);
		stack.push(20);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		System.out.println(stack);
		System.out.println(stack.get(4));
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		
		while(! stack.isEmpty())
		{
			System.out.println(stack.peek());
			stack.pop();
			System.out.println(stack);

			
		}
	}

}
