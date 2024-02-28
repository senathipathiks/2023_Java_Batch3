package com.day2;

import java.util.ArrayList;

public class ALSample3 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(20);
		list.add(50);
		list.add(10);
		System.out.println(list.get(0));//12
		list.remove(1);//12.45 is removed
		System.out.println(list);//[12, Sathya , 10]
		System.out.println(list.size());//3

	}

}