package com.coreDay9;
import java.util.*;
public class ListDemo1 {

	public static void main(String[] args) {
		// List 
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.addAll(arr);
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		arr.remove(4);
		System.out.println(arr);
		System.out.println(arr.get(2));
		//arr.clear();
		//arr.removeAll(arr);
		System.out.println(arr);
		
		for(int i = 0; i<arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
		
		for (Integer i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		Iterator<Integer> it = arr.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		
		
	}

}
