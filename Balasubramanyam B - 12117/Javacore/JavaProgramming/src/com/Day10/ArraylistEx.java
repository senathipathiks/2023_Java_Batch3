package com.Day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistEx {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(60);
		list.add(50);
		list.add(40);
		
		System.out.println(list.get(4));
		//list.addAll(list);
		Collections.sort(list);
		System.out.println(list);
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		for(int i:list) {
			System.out.print(i+" ");
		}
		list.remove(4);
		
		System.out.println();
		list.addAll(list);
		System.out.println(list);
		System.out.println(list.contains(50));
	}
}