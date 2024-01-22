//Write a Java program to add two binary numbers.

package com.day;

import java.util.Scanner;
import java.util.Stack;

class binary{
	static void binarytodec(int num) {
		Stack<Integer> st = new Stack<Integer>();
		
		while(num>0) {
			st.push(num%2);
			num=num/2;
		}
		
		while(!(st.isEmpty())) {
			System.out.print(st.pop());
		}
	}
}

public class Task5 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Integer to convert into Binary: ");
		int num =obj.nextInt();
		binary.binarytodec(num);
	

	}

}
