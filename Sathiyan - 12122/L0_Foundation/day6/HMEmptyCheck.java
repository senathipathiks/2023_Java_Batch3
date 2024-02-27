package com.day6;

import java.util.HashMap;

public class HMEmptyCheck {

	public static void main(String[] args) {
		
		var map=new HashMap<Integer, String>();
		map.put(59, "Sathya");
		map.put(459, "Tamizh");
		map.put(18, "Gokul");
		map.put(45, "Tharun");
		map.put(7, "Ganapathy");
		
		System.out.println(map +"\n");

		System.out.println("***********************************************\n");
		
		if (map.isEmpty()) {
			System.out.println("Map is Empty");
		}else {
			System.out.println("Map is contain a keys and values");
		}
		
		

	}

}
