package com.day8;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Colle6 {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(10);
		set.add(50);
		set.add(70);
		set.add(150);
		set.add(56);
		System.out.println(set);
		
		set.add(50);
		System.out.println(set);
		
		for(Integer i :set) {
			System.out.println(i);
		}
		
		System.out.println();
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	

	}

}
