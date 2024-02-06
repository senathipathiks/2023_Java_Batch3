package com.day9.collectionapi;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		
		
		Stack<String> s= new Stack<>();
		
		s.push("Prasanth");
		s.push("Surya");
		s.push("Jeeva");
		s.push("Jothi");
		
		System.out.println(s);
		
		System.out.println(s.peek());
		
		System.out.println(s.get(0));
		
		System.out.println("For each loop");
		
		for (String string : s) {
			
			System.out.print(string+" ");
		}
		
		System.out.println();
		
		System.out.println("for loop :");
		
		for (int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i)+" ");
		}
	}

}
