package com.day3;

import java.util.Scanner;
import java.util.Stack;

public class StackDisplay {

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
		System.out.println("Top value : "+stack.peek());
		System.out.println("Bottom value : "+stack.firstElement());

	}

}
