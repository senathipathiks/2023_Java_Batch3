package com.Day_9;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(1, "Sathyan");
		map.put(2, "Gayathri");
		map.put(3, "Tamizh");
//		map.put(null, null);
		map.put(4, "Siva");
		map.put(5, "Valli");
		
		System.out.println(map.get(1));
		
		for (Map.Entry<Integer, String> m:map.entrySet()) {
			System.out.println(m.getKey() +" "+m.getValue());
		}

	}

}
