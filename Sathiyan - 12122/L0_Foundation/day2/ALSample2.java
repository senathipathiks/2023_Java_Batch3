package com.day2;

import java.util.ArrayList;

public class ALSample2 {
	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<>();
		list.add(12);
		list.add(12.45);
		list.add("Sathya");
		list.add(10);
		System.out.println(list.get(0));//12
		list.remove(1);//12.45 is removed
		System.out.println(list);//[12, Sathya , 10]
		System.out.println(list.size());//3

	}

}