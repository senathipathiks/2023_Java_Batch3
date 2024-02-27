package com.day3;

import java.util.Iterator;
import java.util.LinkedList;

public class LLSample2 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(30);
		System.out.println("Elements present in LinkedList : "+ll);
		System.out.println("Showing Elements : "+ll.get(0));
		ll.remove(0);
		System.out.println("After Removing the elements : "+ll);
		ll.set(2, 40);
		System.out.println("After updating the elements : "+ll);
		
		//way-1
		System.out.println("Way-1 Using For loop");
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i)+" ");
		}
		System.out.println();
		
		//way-2
		System.out.println("Way-2 Using For-each");
		for (Integer i : ll) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//way-3
		System.out.println("Way-3 Using Iterator");
		Iterator<Integer> it=ll.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
}
