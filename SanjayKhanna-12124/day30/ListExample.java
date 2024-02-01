package com.day30;

import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> list =  new ArrayList<Integer>();
		
		list.add(30);
		list.add(50);
		list.add(20);
		list.add(40);
		list.add(10);
		//list.addAll(list);
		System.out.println("List : "+list);
		
		//Sorting List
		Collections.sort(list);
		System.out.println("Sorted List : "+list);
		
		//Remove from a List
		list.remove(4);
		System.out.println("List : "+list);
		
		//Iteration using For Loop
		System.out.print("Iterating using For Loop : ");
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");
		
		//Iteration using For Each Loop
		System.out.print("\nIterating using For Each : ");
		for(int i: list)
			System.out.print(i+" ");
		
		//Iteration using Iterator 
		System.out.print("\nIterator using Iterator : ");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
		

	}

}
