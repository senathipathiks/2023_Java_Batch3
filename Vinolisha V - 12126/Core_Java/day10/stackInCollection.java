package com.day10;

import java.util.Stack;

public class stackInCollection {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("Vino");
		stack.push("Vinisha");
		stack.push("Brainy");
		stack.push("Vinolisha");
		
		System.out.println(stack);
		
		stack.pop();//it will remove, which you have entered in the last
		System.out.println(stack);
		
		System.out.println(stack.peek()); //it will show the last one
		
		System.out.println(stack.get(0)); //it will display the strings based on the index values

	}

}
