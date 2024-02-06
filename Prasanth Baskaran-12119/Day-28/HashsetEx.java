package com.day9.collectionapi;

import java.util.HashSet;
import java.util.Iterator;

import com.Day6.ForEachLambda;

public class HashsetEx {

	public static void main(String[] args) {
		
		HashSet<String>h= new HashSet<>();
		
		h.add("Sundar");
		h.add("Srini");
		h.add("Jothi");
		h.add("sathiya");
		h.add(null);
		
		System.out.println(h);
		
		System.out.println("Using For Each lambda :");
		
		 h.forEach((var)->System.out.print(var+" "));
		 
		 h.remove(2);
		 
		 System.out.println();
		 
		 Iterator<String>it = h.iterator();
		 
		 while(it.hasNext()) {
			 
			 System.out.print(it.next()+" ");
		 }
				
	}

}
