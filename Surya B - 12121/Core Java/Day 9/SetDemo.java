package com.coreDay9;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {

		HashSet<String> s = new HashSet<String>();
		
		s.add("Ferrari");
		s.add("Lambo");
		s.add("Bentley");
		s.add("Mercedes");
		
		System.out.println(s);
		
		s.remove("Lambo");
		System.out.println(s);
		
		for (String i : s) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		Iterator<String> it = s.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
	}

}
