package com.javaday5;

import java.util.HashSet;
import java.util.Iterator;

public class HashDemo {
	public static void main(String args[]) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(10);
		System.out.println(set);
		System.out.println(set.size());
		
		for(Integer i : set) {
			System.out.println(i);
		}
		System.out.println("-----------------------------------");
		set.forEach(e -> System.out.println(e));// for each arrow function
		System.out.println("--------------------------");
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
