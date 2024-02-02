package com.day8;

import java.util.Iterator;
import java.util.LinkedList;

public class Colle2 {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Apple");
		list.add("Orange");
		list.add("PineApple");
		list.add("Mango");
		
		System.out.println(list);
		
		//for-loop
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		//for-each
		for(String i : list) {
			System.out.println(i);
		}
		System.out.println();
		//Iterator
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
