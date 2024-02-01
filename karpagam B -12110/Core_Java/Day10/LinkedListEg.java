package Com.Day10;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEg {
//linkdelist is implemented internally as doubly linked list
	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();
		list.add("vino");
		list.add("Kamini");
		list.add("Sowmi");
		list.add("Sherin");
		list.add("Kaviya");
//		list.addAll(list); // to print the same element twice 
		System.out.println(list);//to print the elements in the list
		
		System.out.println("-------------");
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("--------------");
		list.remove(4);
		System.out.println(list);
		
		System.out.println("--------------");
		System.out.println(list.get(2));
		
		System.out.println("--------------");//traversing using for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)+ " ");
		}
		
		System.out.println("--------------");
        for (String i : list) {
			System.out.println(i+" ");
		}
       
		System.out.println("--------------");//traversing using iterator
        Iterator<String> itr=list.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
		

		

	}

}

	
