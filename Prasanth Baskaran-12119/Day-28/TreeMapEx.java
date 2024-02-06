package com.day9.collectionapi;

import java.security.KeyStore.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		
		
		Map<Integer,String>map = new TreeMap<>();
		
		
		map.put(1, "Prasanth");
		map.put(2, "Sena");
		map.put(3, "Surya");
		map.put(4, "Jothi");
		
		System.out.println(map);
		
		
		
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			
			System.out.println(key+": "+val);
			
		}
		

	}

}
