package com.day6;

import java.util.HashMap;

public class HMMappingValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map=new HashMap<>();
		map.put(59, "Sathya");
		map.put(459, "Tamizh");
		map.put(18, "Gokul");
		map.put(45, "Tharun");
		map.put(7, "Ganapathy");
		
		System.out.println(map);
	
		if (map.containsValue("Logy")) {
			System.out.println("it contains a key and value");
		}else {
			System.out.println("It does not contain Value and keys");
		}
	}

}
