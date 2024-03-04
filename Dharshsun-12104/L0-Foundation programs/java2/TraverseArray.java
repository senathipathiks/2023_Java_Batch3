package com.java2;

import java.util.ArrayList;
import java.util.Iterator;
// traverse 3 for loop methods
public class TraverseArray {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		//way1
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		//way2
		for(Integer i : list) {
			System.out.println(i);
		}
		//way3
		Iterator<Integer> it = list.iterator();//not for array and only data structure
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
