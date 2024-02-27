package com.day3;

import java.util.*;

public class StackRemove {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> stack=new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println(stack);
		boolean decision=true;		
		do {
			System.out.println("Are you sure you want to remove : 1.Yes || 2.No");
			int remover=sc.nextInt();
			if (remover==1) {
				stack.clear();
				System.out.println("Stack is Cleared");
				decision=false;
			}else {
				System.out.println("Stack is not Cleared");
				System.out.println(stack);
			}
			
		} while (decision);
		sc.close();
	}

}
