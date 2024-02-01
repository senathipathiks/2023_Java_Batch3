package com.day30;

import java.util.*;

public class StacKExample {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		char op =' ';
		String str = " ";
		Stack<String> list = new Stack<String>();
		do {
			System.out.println("Enter a String : ");
			str = sc.next();
			list.push(str);
			System.out.println("Are you want to add more ?[y/n]");
			op = sc.next().charAt(0);
		}while(op=='y');
		
		System.out.println("Stack : "+list);
		System.out.println("Pop Element : "+list.peek());
		System.out.println("Pop : "+list.pop());
		System.out.println("Pop : "+list.pop());
		System.out.println("Stack : "+list);
		

	}

}
