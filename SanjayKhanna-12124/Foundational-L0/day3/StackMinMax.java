package com.day3;

import java.util.Scanner;
import java.util.Stack;

public class StackMinMax {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Stack: ");
		int size = sc.nextInt();
		System.out.println("Enter Elements");
		for(int i=0;i<size;i++) {
		stack.push(sc.nextInt());
		}
		stack.sort(null);
		System.out.println("Maximum value : "+stack.peek());
		System.out.println("Minimum value : "+stack.firstElement());
	
		
}

}
