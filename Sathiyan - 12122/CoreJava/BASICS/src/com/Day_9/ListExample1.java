package com.Day_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListExample1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(10);
		arrlist.add(20);
		arrlist.add(30);
		arrlist.add(40);
		arrlist.add(50);
		arrlist.addAll(arrlist);

		System.out.println(arrlist);
		
		Collections.sort(arrlist);
		
		System.out.println(arrlist);
		
		System.out.println(arrlist.remove(4));
		
		System.out.println(arrlist);
		
		System.out.println(arrlist.get(6));
		
//		arrlist.clear();
//		
//		System.out.println(arrlist);
		
		for (int i = 0; i < arrlist.size(); i++) {
			System.out.print(arrlist.get(i)+" ");
		}
		
		System.out.println();
		
		for (Integer i : arrlist) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		Iterator<Integer> itr = arrlist.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");	
		}
	}
}
