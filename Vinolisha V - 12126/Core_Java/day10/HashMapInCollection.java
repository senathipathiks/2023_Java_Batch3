package com.day10;

import java.util.HashMap;
import java.util.Map;

public class HashMapInCollection {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(1, "Vino");
		map.put(2, "Kaviya");
		map.put(3, "Sherin");
		map.put(4, "Vinisha");
		map.put(null, null);
		map.put(4, "Varshini");
		
		System.out.println(map);
		
		for(Map.Entry<Integer,String>m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		

	}

}
