package com.Day_9;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> ref=new HashSet<String>();
		ref.add("Sathya");
		ref.add("Deepika");
		ref.add("Sathiyan");
		ref.add("Gayathri");
		
		System.out.println(ref);
		
		ref.remove("Sathya");
		
		System.out.println(ref.size());
		
		for (String i : ref) {
			System.out.println(i);
		}
		
		Iterator<String> itr=ref.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
				
		
	}

}
