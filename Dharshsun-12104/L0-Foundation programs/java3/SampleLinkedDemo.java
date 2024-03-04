package com.java3;
import java.util.Iterator;
import java.util.LinkedList;

public class SampleLinkedDemo {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(12);
		System.out.println("The list elements are:"+ list );
		System.out.println(list.get(0));
		list.remove(0);
		System.out.println("The list elements are:"+ list );
	for(int i = 0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	    for(Integer i : list ) {
	    	System.out.println(i);
	    }
	    Iterator<Integer> it = list.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	}
		
	
		
	}

}
