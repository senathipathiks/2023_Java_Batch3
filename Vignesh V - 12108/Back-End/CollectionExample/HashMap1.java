package com.corecollection;

import java.util.*;

public class HashMap1 {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "vicky");
		map.put(2, "sanjai");
		map.put(3, "vishnu");
		map.put(4, "logesh");
		map.put(null, null);
		map.put(6, "Gowtham");
		
		System.out.println(map.get(1));
		
		
		for(Map.Entry<Integer,String> m:map.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}

	}

}
