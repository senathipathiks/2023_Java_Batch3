package com.day3;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class StackSearch {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Stack: ");
		int size = sc.nextInt();
		System.out.println("Enter Elements");
		for(int i=0;i<size;i++) {
		stack.push(sc.nextInt());
		}
		System.out.println("Enter the Element for Search");
		int elem=sc.nextInt();
		
		Iterator<Integer> it = stack.iterator();
		int i=0;
		while(it.hasNext()) {
			if(it.next()==elem) {
				System.out.println("Element found at "+i+" position");
				break;
			}
			i++;
		}
		if(i==stack.size()) {
			System.out.println("Element not Found..!");
		}

	}

}
