package com.javacoreday9collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> set= new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(30);
		set.add(10);
		System.out.println(set);
		
		set.remove(30);
		System.out.println(set.size());
		
		for(int i:set) {
			System.out.println(i);
		}
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
