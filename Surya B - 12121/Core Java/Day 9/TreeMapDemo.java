package com.coreDay9;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TreeMap
		
		TreeMap<String, String> map = new TreeMap<String, String>();
		
		map.put("Chennai", "Tamil Nadu" );
		map.put("Bangalore", "Karnataka");
		map.put("Bombay", "Maharastra");
		map.put("Trivandrum", "Kerala");
		
		System.out.println(map);
		
		for(Map.Entry<String, String> m:map.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
