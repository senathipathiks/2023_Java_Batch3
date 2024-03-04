package com.javaday6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashCount {
	public static void main(String args[]) {
		HashMap<Integer,String> hp = new HashMap<Integer,String>();
		int count=0;
		hp.put(10,"string");
		hp.put(20,"float");
		hp.put(25,"element");
		hp.put(30,"integer");
		hp.put(35,"object");
		System.out.println(hp);
		Set<Integer> s = hp.keySet();
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			count++;
		}
			
			System.out.println("Total set "+count);
			
		}
		

}

