package com.day5;

import java.util.HashMap;

public class MapSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map=new HashMap<>();
		map.put(59, "Sathya");
		map.put(459, "Tamizh");
		map.put(18, "Gokul");
		map.put(45, "Logesh");
		map.put(7, "Ganapathy");
		map.put(99, "Tharun");
		
		
		System.out.println(map);
		
		map.put(99, "Sanjai");
		System.out.println(map);
		
		map.remove(99);
		System.out.println(map);
		
	}

}
