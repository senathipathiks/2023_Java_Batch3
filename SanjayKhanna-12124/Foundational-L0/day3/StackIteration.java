package com.day3;

import java.util.Scanner;
import java.util.Stack;

public class StackIteration {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Stack: ");
		int size = sc.nextInt();
		System.out.println("Enter Elements");
		for(int i=0;i<size;i++) {
		stack.push(sc.nextInt());
		}
		System.out.println();
		System.out.print("Stack Elements are :");
		while(!stack.isEmpty()) {
			System.out.print(" "+stack.pop());
		}
	}

}
