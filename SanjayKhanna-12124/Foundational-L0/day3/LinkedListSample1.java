package com.day3;

import java.util.*;
public class LinkedListSample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list=new LinkedList<Integer>();
		System.out.println("Enter the No of Element to add: ");
		int listSize = sc.nextInt();
		System.out.println("Enter Elements");
		for(int i=0;i<listSize;i++) {
			list.add(sc.nextInt());
		}
		//Way1
		System.out.println("List : "+list);
		System.out.println();
		System.out.println("Using For loop : ");
		//Way2
		for(int i=0;i<listSize;i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println("Using For each : ");
		//Way3
		for(Integer i : list) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.println("Using Iterator : ");
		//Way4
		Iterator<Integer> it= list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}
