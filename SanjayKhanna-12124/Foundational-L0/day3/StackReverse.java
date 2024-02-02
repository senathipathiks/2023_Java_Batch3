package com.day3;

import java.util.Scanner;
import java.util.Stack;

public class StackReverse {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Stack: ");
		int size = sc.nextInt();
		System.out.println("Enter Elements");
		for(int i=0;i<size;i++) {
		stack.push(sc.nextInt());
		}
		System.out.println("Stack : "+stack);
		Stack<Integer> stack1 = new Stack<Integer>();
		while(!stack.isEmpty()) {
			stack1.push(stack.pop());
		}
		System.out.println("Reverse Stack : "+stack1);
//		System.out.println(stack1.capacity());
	}

}
