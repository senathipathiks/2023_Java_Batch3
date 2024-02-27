package com.day6;

import java.util.HashMap;

public class HMClone {

	@SuppressWarnings({ "rawtypes", "unchecked" })

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<>();
		HashMap<Integer, String> map2=new HashMap<>();
		map.put(59, "Sathya");
		map.put(459, "Tamizh");
		map.put(18, "Gokul");
		map.put(45, "Tharun");
		map.put(7, "Ganapathy");
		
		map2=(HashMap) map.clone();
		
		System.out.println(map);
		System.out.println(map2);

	}

}
