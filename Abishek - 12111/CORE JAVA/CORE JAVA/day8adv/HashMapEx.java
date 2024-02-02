package com.day8adv;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "abishek");
		map.put(2, "lee");
		map.put(3, "akash");
		map.put(4, "barath");
		map.put(null, null);
		map.put(5, "Emperor");
		map.put(5, "k1ng");
		System.out.println(map.get(1));
		for(Map.Entry<Integer, String> m:map.entrySet())
		{
			System.out.println(m.getKey() +" "+m.getValue());
		}
		
		
	
	
	
	
	
	
	
	
	
	
	
	}

}
