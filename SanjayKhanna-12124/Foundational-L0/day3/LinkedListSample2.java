package com.day3;

import java.util.LinkedList;

public class LinkedListSample2 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		System.out.println("List : "+list);
		System.out.println(list.get(0));
		list.remove(4);
		System.out.println("List"+list);
		list.set(1, 25);
		System.out.println("List"+list);
	}

}
