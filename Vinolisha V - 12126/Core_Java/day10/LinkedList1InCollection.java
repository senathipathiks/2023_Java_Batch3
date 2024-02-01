package com.day10;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1InCollection {

	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<Integer>();
		
		list.add(12);
		list.add(13);
		list.add(18);
		list.add(16);
		list.add(17);
		
//		list.addAll(list);
//		System.out.println(list);//[12, 13, 15, 16, 17, 12, 13, 15, 16, 17]
//		
		Collections.sort(list);
		System.out.println(list);//[12, 13, 16, 17, 18]
		
		list.remove(2);
		System.out.println(list);
		
		System.out.println();
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)+"");
		}
		
		System.out.println();
		
		for (Integer integer : list) {
			System.out.println(integer+" ");
		}
		
		System.out.println();
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
			
	}

}
