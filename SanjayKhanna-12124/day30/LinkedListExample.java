package com.day30;

import java.util.*;

public class LinkedListExample {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		char op =' ';
		String str = " ";
		LinkedList<String> list = new LinkedList<String>();
		do {
			System.out.println("Enter a String : ");
			str = sc.next();
			list.add(str);
			System.out.println("Are you want to add more ?[y/n]");
			op = sc.next().charAt(0);
		}while(op=='y');
		
		System.out.println("List : "+list);
		
		//Sorting List
		Collections.sort(list);
		System.out.println("Sorted List : "+list);
		
		//Remove from a List
//		list.remove(4);
//		System.out.println("List : "+list);
		
		//Iteration using For Loop
		System.out.print("Iterating using For Loop : ");
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");
		
		//Iteration using For Each Loop
		System.out.print("\nIterating using For Each : ");
		for(String i: list)
			System.out.print(i+" ");
		
		//Iteration using Iterator 
		System.out.print("\nIterator using Iterator : ");
		Iterator<String> it = list.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");

	}

}
