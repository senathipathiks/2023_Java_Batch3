package com.day6;

import java.util.HashMap;


public class HmSetViewKey {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<>();
		map.put(59, "Sathya");
		map.put(459, "Tamizh");
		map.put(18, "Gokul");
		map.put(45, "Tharun");
		map.put(7, "Ganapathy");
		
		System.out.println(map);
		
		System.out.println(map.keySet());

	}

}
