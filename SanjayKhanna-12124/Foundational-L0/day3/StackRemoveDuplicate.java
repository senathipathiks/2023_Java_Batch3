package com.day3;

import java.util.Scanner;
import java.util.Stack;

public class StackRemoveDuplicate {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Stack: ");
		int size = sc.nextInt();
		System.out.println("Enter Elements");
		for(int i=0;i<size;i++) {
		stack.push(sc.nextInt());
		}
		System.out.println("Stack : "+stack);
		for(int i=0;i<stack.size();i++) {
			for(int j=0;j<stack.size();j++) {
				if((i!=j)&&(stack.get(i)==stack.get(j)))
						stack.remove(j);
			}
		}
		System.out.println("After Removing Duplicate : "+stack);

	}

}
