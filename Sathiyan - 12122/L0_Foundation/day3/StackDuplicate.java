package com.day3;

import java.util.Stack;

public class StackDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(10);
		stack.push(40);
		stack.push(50);
		stack.push(20);
		stack.push(40);
		
		System.out.println("Stack : "+stack);
		
		for (int i = 0; i < stack.size(); i++) {
			for (int j = i+1; j < stack.size(); j++) {
				if (stack.get(i)==stack.get(j)) {
					stack.remove(j);
				}
			}
		}
		System.out.println("After Removing Duplicate : "+stack);

	}

}
