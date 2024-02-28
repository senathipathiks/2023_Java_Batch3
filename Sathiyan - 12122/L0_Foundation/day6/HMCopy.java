package com.day6;

import java.util.HashMap;

public class HMCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map=new HashMap<>();
		HashMap<Integer, String> map2=new HashMap<>();
		map.put(59, "Sathya");
		map.put(459, "Tamizh");
		map.put(18, "Gokul");
		map.put(45, "Tharun");
		map.put(7, "Ganapathy");
		
		
		map2.putAll(map);
		
		System.out.println("Map 1 Elements : "+map);
		System.out.println("Map 2 Elements : "+map2);
	}

}
