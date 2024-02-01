package com.day10; // hashset will not allow duplicate values 
				//inserction order is not preserved

import java.util.HashSet;
import java.util.Iterator;

public class HashsetInCollection {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("Vinolisha");
		set.add("Kiruba");
		set.add("Srini");
		set.add("Jothi");
		set.add("Sherin");
		set.add("Kaviya");
		set.add("Vinolisha");
		set.add("Vino");
		
		System.out.println(set); 
		
		set.remove("Vinolisha");
		System.out.println(set);
		
		System.out.println(set.size()); // it will display the size
		
		for (String string : set) {
			System.out.println(string);
		}
		
		System.out.println();
		
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			
			System.out.println(string);
		}
		
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		

	}

}
