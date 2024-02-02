package com.day8;

import java.util.HashSet;
import java.util.Iterator;

public class Colle5 {

	public static void main(String[] args) {
		
		//Addall - add two sets together
		//Retainall - common things between two sets
		//removeall - difference between two sets
		
		//Hashset - doesnot follow the insertion order
		//linkedHashset - follow the insertion order
		//Treeset - it print in ascending order
		
		HashSet<String> set = new HashSet<String>();
		set.add("benz");
		set.add("hero");
		set.add("honda");
		set.add("suzuki");
		set.add("maruti");
		System.out.println(set);
		
		set.add("hero");
		System.out.println(set);
		
		for(String i :set) {
			System.out.println(i);
		}
		
		System.out.println();
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
