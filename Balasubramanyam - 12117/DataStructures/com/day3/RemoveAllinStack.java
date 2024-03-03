package com.day3;

import java.util.Stack;

public class RemoveAllinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>stack=new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.clear();
		System.out.println("All elemnets is Removed: "+stack);
	}

}
