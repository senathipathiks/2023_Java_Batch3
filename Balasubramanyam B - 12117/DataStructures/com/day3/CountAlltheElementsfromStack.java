package com.day3;

import java.util.Stack;

public class CountAlltheElementsfromStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>stack=new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		System.out.println(stack);
		int count=0;
		for(int i=0;i<stack.size();i++) {
			count++;
		}
		System.out.println("All the stack elements is: "+count);
	}

}
