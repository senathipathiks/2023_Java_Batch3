package com.day6;

import java.util.HashMap;

public class HMRemoveAll {

	public static void main(String[] args) {
		
		var map=new HashMap<Integer, String>();
		map.put(59, "Sathya");
		map.put(459, "Tamizh");
		map.put(18, "Gokul");
		map.put(45, "Tharun");
		map.put(7, "Ganapathy");
		
		System.out.println(map);
		
		map.clear();
		
		System.out.println(map);

	}

}
