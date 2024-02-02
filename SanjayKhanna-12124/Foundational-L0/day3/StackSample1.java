package com.day3;

import java.util.Stack;

public class StackSample1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println("Stack :"+stack);
		stack.pop();
		System.out.println("After Pop() Stack :"+stack);
		System.out.println("Stack Peek() :"+stack.peek());
		System.out.println(stack.empty());
	}

}
