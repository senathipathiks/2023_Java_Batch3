package com.Day10;
import java.util.*;
public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(40);
		list.add(30);
		System.out.println(list);
		
		for(int i1:list) {
			System.out.print(i1+" ");
		}
		Collections.sort(list);
		System.out.println();
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		list.addAll(list);
		System.out.println(list);
		Collections.sort(list);
		System.out.println();
		list.clear();
		System.out.println(list);
	}

}
