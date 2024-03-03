package com.day6;

import java.util.*;

public class CopyAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map1.put(1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		System.out.println(map1);
		map2.put(4, "White");
		map2.put(5, "Blue");
		map2.put(6, "Orange");
		System.out.println(map2);
		System.out.println("********************************************************");
		map2.putAll(map1);
		System.out.println(map2);
	}

}
