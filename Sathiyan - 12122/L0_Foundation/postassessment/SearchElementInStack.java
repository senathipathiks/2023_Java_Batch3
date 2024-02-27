package com.postassessment;

import java.util.Scanner;
import java.util.Stack;

public class SearchElementInStack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> stack=new Stack<>();
		
		System.out.print("Enter the number of element you want to store: ");
		int input=sc.nextInt();
		System.out.println("Enter the Elements");
		
		for (int i = 0; i < input; i++) {
			int value=sc.nextInt();
			stack.push(value);	
		}
		
		System.out.println("Element stored in stack \n");
		
		System.out.print("Enter the element you want to search : " );
		int searchElement=sc.nextInt();
		
		int count=0;
		
		for (int i = 0; i < stack.size(); i++) {
			if (searchElement==stack.get(i)) {
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
