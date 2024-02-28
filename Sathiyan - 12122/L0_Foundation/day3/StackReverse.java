package com.day3;

import java.util.*;

public class StackReverse {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		Stack<Integer> reversed=new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack);	
		for (int i = stack.size()-1; i >=0; i--) {
			reversed.push(stack.pop());
		}
		System.out.println(reversed);
		while (!reversed.isEmpty()) {
			System.out.print(reversed.pop()+" ");
			
		}
	}
}
