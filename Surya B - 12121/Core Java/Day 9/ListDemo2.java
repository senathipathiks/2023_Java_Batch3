package com.coreDay9;

import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Jeeva");
		ll.add("Prasanth");
		ll.add("Prem");
		ll.add("Abishek");
		ll.add("Lokesh");
		ll.add("Vignesh");
		ll.addAll(ll);
		
		System.out.println(ll);
		ll.remove(4);
		
		System.out.println(ll);
		
		System.out.println(ll.get(2));
		//arr.clear();
		//arr.removeAll(arr);
		System.out.println(ll);
		
		for(int i = 0; i<ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		
		for (String i : ll) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		Iterator<String> it2 = ll.iterator();
		
		while(it2.hasNext()) {
			System.out.print(it2.next() + " ");
		}
		System.out.println();
		
	}

}
