package com.coreDay9;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
			//Map
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Surya");
		map.put(2, "Jothi");
		map.put(3, "Abhishek");
		map.put(4, "Prasanth");
		map.put(5, "Jeeva");
		
		System.out.println(map);
		
		for(Map.Entry<Integer, String> m:map.entrySet()) 
		{
			System.out.println(m.getKey() + " = " + m.getValue());
		}
		
		System.out.println(map.get(1));
	}

}
