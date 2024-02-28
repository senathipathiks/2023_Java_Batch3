package com.day5;

import java.util.*;
import java.util.Map.Entry;

public class TreemapSample {

	public static void main(String[] args) {
		
				TreeMap<Integer, String> map=new TreeMap<>();
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
				
				System.out.println("*********************************************");
				
				
				System.out.println(map.get(59));
				
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

	}

}
