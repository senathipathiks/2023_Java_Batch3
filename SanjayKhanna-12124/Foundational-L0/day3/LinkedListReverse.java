package com.day3;

import java.util.LinkedList;

public class LinkedListReverse {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("Linked List : "+list);
		
		LinkedList<Integer> reverseList = new LinkedList<Integer>();
		
		for(int i=list.size()-1;i>=0;i--) {
			reverseList.add(list.get(i));
		}
		System.out.println("New Linked List : "+ reverseList);

	}

}
