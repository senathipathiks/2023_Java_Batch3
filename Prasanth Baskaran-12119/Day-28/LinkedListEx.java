package com.day9.collectionapi;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		
		 List<String>list = new LinkedList<>();
		 
		 list.add("Prashanth");
		 list.add("Surya");
		 list.add("Jeeva");
		 list.add("Abi");
		 
		 System.out.println(list);
		 
		 Collections.sort(list);
		 
		 System.out.println(list);
		 
		 System.out.println(list.remove(3));
		 
		 System.out.println("Using For Loop :");
		 
		 for (int i = 0; i <list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		 
		 System.out.println();
		 
		 System.out.println("Using For Each Loop :");
		 
		 for (String string : list) {
			 
			 System.out.print(string+" ");
			
		}
		 
		 System.out.println();
		 
		 System.out.println("Using Iterator loop :");
		 
		 Iterator<String> it = list.iterator();
		 
		 while(it.hasNext()) {
				
				System.out.print(it.next()+" ");
			}
	}

}
