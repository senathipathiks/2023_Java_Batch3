package com.day9.collectionapi;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	

	public static void main(String[] args) {
		
		Map<Integer,String>map = new HashMap<>();
		
		map.put(1, "Prasanth");
		map.put(2, "Sena");
		map.put(3, "Surya");
		map.put(null, "Jothi");
		
		System.out.println(map);
		
		
		
		for (Map.Entry<Integer, String> e : map.entrySet()) {
			Integer key = e.getKey();
			String val = e.getValue();
			
			System.out.println(key+": "+val);
			
		}
		
		

	}

}
