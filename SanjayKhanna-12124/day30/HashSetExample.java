package com.day30;

import java.util.*;

public class HashSetExample {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		char op =' ';
		String str = " ";
		
		do {
			System.out.println("Enter a String : ");
			str = sc.next();
			set.add(str);
			System.out.println("Are you want to add more ?[y/n]");
			op = sc.next().charAt(0);
		}while(op=='y');

		System.out.println("Set : "+set);
		
		System.out.print("Iteration using Iterator : ");
		Iterator<String> it = set.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}

}
