package com.day3;

import java.util.*;

public class StackPresentCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> stack=new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		System.out.println(stack);
		
		System.out.print("Enter the element you want to search : " );
		int input=sc.nextInt();
		int count=0;
		for (int i = 0; i < stack.size(); i++) {
			if (input==stack.get(i)) {
				System.out.println("Element is present in Index " +i);
				count++;
			}	
		}
		if (count==0) {
			System.out.println("Element Not Present in a stack");			
		}
		sc.close();
	}
}
