package com.day5;

import java.util.*;

public class HS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(40);
		
		System.out.println(set);
		
		System.out.println("Size of the Hashset is : "+set.size());
		
		
		System.out.println("********Way-1**********");
		
		for (Integer i : set) {
			System.out.println(i);
			
		}
		
		System.out.println("********Way-2**********");
		
		Iterator<Integer> it=set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
