package com.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Colle1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(90);
		arr.add(50);
		arr.addAll(arr);
		System.out.println(arr);
		
		//sorting
		Collections.sort(arr);
		System.out.println(arr);
		
		//remove
		arr.remove(4);
		System.out.println(arr);
		
		//get
		System.out.println("get: "+ arr.get(2));
		 
		
		//delete all
		
		//arr.clear();
		//System.out.println(arr);
		
		
		//For-loop
		System.out.println("For-loop");
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
		
		
		//For-each
		System.out.println("ForEach-loop");
		for(int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//Iterator
		System.out.println("Iterator method");
		Iterator<Integer> it = arr.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}

	}

}
