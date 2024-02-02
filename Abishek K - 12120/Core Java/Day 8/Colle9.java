package com.day8;

import java.util.Map;
import java.util.TreeMap;

public class Colle9 {

	public static void main(String[] args) {
		
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("D", "car");
		map.put("C", "Bike");
		map.put("B","Cycle");
		map.put("D", "Scooty");
		//map.put(null, null);  thrown exception
 		System.out.println(map);
		
		for(Map.Entry<String, String> m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
