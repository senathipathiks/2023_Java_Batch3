package com.day6;

import java.util.HashMap;
import java.util.Map;

public class HashMapCopy {

	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<Integer, String>();
		Map<Integer, String> map1= new HashMap<Integer, String>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(8, "Eight");
		map1.putAll(map);
		System.out.println("Map : "+map);
		System.out.println("Copied Map : "+map1);

	}

}
