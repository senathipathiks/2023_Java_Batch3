package com.day2;

import java.util.ArrayList;

public class ArrayListSample1 {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add(3.14);
		list.add("sanjay");
		System.out.println(list);		//display Array list
		System.out.println(list.get(0));//10
		list.remove(1);
		System.out.println(list);
		System.out.println(list.size());
//		list.sort(null);
//		System.out.println(list);
	}

}
