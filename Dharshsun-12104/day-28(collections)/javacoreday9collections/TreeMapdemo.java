package com.javacoreday9collections;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapdemo {
	public static void main(String[] args) {
		
		
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(1, "Dharshsun");
		map.put(2, "Chandru");
		map.put(3, "Rajesh");
		map.put(3,"Gowtham");
//		map.put(null, null);
		System.out.println(map.get(1));
		
		for(Map.Entry<Integer, String> m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
