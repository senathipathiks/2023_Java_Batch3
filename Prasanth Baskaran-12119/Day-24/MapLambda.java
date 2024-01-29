package com.Day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MapLambda {

	public static void main(String[] args) {
		
		Map<Integer,Integer>map = new HashMap<>();
		
		System.out.println("Enter the size of map function");
		
		Scanner sc = new Scanner (System.in);
		int size ;
		
		size = sc.nextInt();
		
		System.out.println("Enter the values");
		
		
		
		for (int i = 0; i < size; i++) {
			
		 System.out.println("Enter key");
		 int key = sc.nextInt();
		 
		 System.out.println("Enter value");
		 
		 int val = sc.nextInt();
		 
		 map.put(key, val);
			
		}
		
		System.out.println("Normal foreach :");
	    for (Entry<Integer, Integer> entry : map.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			
			
			System.out.print(key+" ");
			System.out.print(val);
		}

	    
	    System.out.println();
	    System.out.println("By using lambda");
	    map.keySet().forEach((i)->System.out.println(i+" "+map.get(i)));
	}

}
