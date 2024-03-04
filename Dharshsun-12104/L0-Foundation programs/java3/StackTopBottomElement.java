package com.java3;
import java.util.Scanner;
import java.util.Stack;
// top and bottom element of stack
public class StackTopBottomElement {
	public static void main(String args[]) {
		Stack<Integer> search = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the stack");
		int n = sc.nextInt();

		System.out.println("Enter the elements : ");
		for (int i = 0; i < n; i++)
			search.add(sc.nextInt());
		
		System.out.println("Top value : " +search.peek());
		System.out.println("Bottom value : "+search.firstElement());
	}

}
