package com.day3;

import java.util.*;

public class StackMinMax {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		stack.push(2);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(5);
		stack.push(90);
		stack.push(70);
		
		System.out.println(stack);
		
		int min=stack.get(0);
		int max=stack.get(0);
		
		for (int i = 0; i < stack.size(); i++) {
			if (stack.get(i) > max) {
				max=stack.get(i);
			}
			
			if (stack.get(i) < min) {
				min=stack.get(i);
			}
			
		}
		System.out.println("Maximum value in a stack is "+max+ " at "+stack.indexOf(max)+" Index");
		System.out.println("Maximum value in a stack is "+min+ " at "+stack.indexOf(min)+" Index");
		
	}

}
