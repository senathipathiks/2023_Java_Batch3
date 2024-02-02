package com.day9Collections;

import java.util.HashMap;
import java.util.Map;

public class HashmapPrg1 {

	public static void main(String[] args) {
		HashMap<Integer,String>map = new HashMap<Integer,String>();
		map.put(10,"Hii");
		map.put(30,"Hai");
		map.put(20,"Hello");
		map.put(40,"Say");
		map.put(null, null);
		map.put(40, "thanks");
		System.out.println(map.get(1));
		
		
		for(Map.Entry<Integer,String>m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
