package com.day6;

import java.util.*;

public class HMGetValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<Integer, String> map=new HashMap<>();
		map.put(59, "Sathya");
		map.put(459, "Tamizh");
		map.put(18, "Gokul");
		map.put(45, "Tharun");
		map.put(7, "Ganapathy");
		
		System.out.println(map);
		System.out.println("Enter the key You want to search : " );
		int key=sc.nextInt();
		
		System.out.println(map.get(key));
		
		sc.close();
	}

}
