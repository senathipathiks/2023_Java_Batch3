package com.day5;

import java.util.HashMap;

public class HashMapSample1 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "Four");
		System.out.println("Map : "+map);
		map.put(1, "Minus one");
		System.out.println("Map : "+map);
		map.remove(1);
		System.out.println("Map : "+map);
		map.put(1,"three");
		System.out.println("Map : "+map);
		System.out.println("Value for 4 :"+map.get(4));
	}

}
