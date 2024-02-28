package com.day5;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TreeMap<Integer, String> map=new TreeMap<>(Collections.reverseOrder());
//		map.put(59, "Sathya");
//		map.put(459, "Tamizh");
//		map.put(18, "Gokul");
//		map.put(45, "Logesh");
//		map.put(7, "Ganapathy");
//		map.put(99, "Tharun");
		
		System.out.println("Enter the Number the value you want to Insert : ");
		int input=sc.nextInt();

		
		for (int i = 0; i < input; i++) {
			System.out.println("Enter the key and Value : ");
			map.put(sc.nextInt(),sc.next());
		}
		
		
		System.out.println(map);

		
		//way-1
		System.out.println("*****************************************");
		Set<Integer> set=map.keySet();
		Iterator<Integer> it=set.iterator();
		while (it.hasNext()) {
			Integer key=it.next();
			System.out.println(key +" : "+ map.get(key));
			
		}
		
		System.out.println("***********************************************");
		for (Integer key : set) {
			System.out.println(key + " : " + map.get(key));
			
		}
		
		System.out.println("*************************************");
		
		//way-2
		Set <Entry<Integer,String>> set1=map.entrySet();
		Iterator<Entry<Integer, String>> it1=set1.iterator();
		while (it1.hasNext()) {
			Entry<Integer, String> entry=it1.next();
			System.out.println(entry.getKey() +"  : "+entry.getValue());			
		}
		
		System.out.println("***********************************************");
		for (Entry<Integer, String> entry : set1) {
			System.out.println(entry.getKey() +" : "+entry.getValue());	
		}
		
		sc.close();

	}

}
