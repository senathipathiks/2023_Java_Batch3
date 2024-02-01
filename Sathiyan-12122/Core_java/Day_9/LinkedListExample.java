package com.Day_9;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Sathya");
		ll.add("Sathiyan");
		ll.add("Tamizh");
		ll.add("Sivaraj");
		ll.add("Valli");
		
		System.out.println(ll);
		
		
		Collections.sort(ll);
		
		
		System.out.println(ll.remove(2));
		
		
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i)+" ");
		}
		
		for (String str : ll) {
			System.out.print(str);
		}
		
		Iterator<String> itr =ll.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");	
		}
	}

}
