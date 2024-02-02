package com.day5;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample1 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		System.out.println("Set :"+set);
		System.out.println("Size of Set : "+set.size());
		//way1
		System.out.print("Using For each : ");
		for(Integer i:set) {
			System.out.print(i+" ");
		}
		//way2
		System.out.println();
		System.out.print("Using Iterator : ");
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		

	}

}
