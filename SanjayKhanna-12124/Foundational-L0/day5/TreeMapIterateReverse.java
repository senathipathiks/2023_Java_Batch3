package com.day5;

import java.util.Collections;
import java.util.TreeMap;

public class TreeMapIterateReverse {

	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<Integer, String>(Collections.reverseOrder());
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "Four");
		System.out.println("Map : "+map);
		//Iterator Using KeySet()
		System.out.println("Iterator() : ");
		for(Integer i:map.keySet()) {
			System.out.println("Key : "+i+" Value : "+map.get(i));
		}

	}

}
