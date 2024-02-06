package com.day9.collectionapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import com.Day6.ForEachLambda;

public class ArrayListEx {

	public static void main(String[] args) {
		
		
		ArrayList<Integer>list = new ArrayList<>();
		
		list.add(11);
		list.add(55);
		list.add(71);
		list.add(85);
		list.add(13);
		list.addAll(list);
		
		System.out.println(list);
		Collections.sort(list);
		
		System.out.println(list);
		
		System.out.println(list.remove(4));
		
		
		System.out.println(list.get(4));
		
		//list.clear();
		
		System.out.println("For loop Iterations :");
		for (int i = 0; i < list.size(); i++) {
			
			System.out.print(list.get(i)+" ");
			
		}
		
		
		System.out.println();
		
		System.out.println("For Each Loop iterations :");
		for (Integer integer : list) {
			
			System.out.print(integer+" ");
		}
		
		System.out.println();
		Iterator<Integer> it = list.iterator();
		
		System.out.println("Iterator using loop :");
		
		while(it.hasNext()) {
			
			System.out.print(it.next()+" ");
		}
		
	  
		

	}

}
