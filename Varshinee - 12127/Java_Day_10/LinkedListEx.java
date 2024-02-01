package Java_Day_10;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Varshinee");
		list.add("Appu");
		list.add("Sandy");
		list.add("Subiksha");
		list.add("Raga");
		System.out.println(list);
		list.addAll(list);
		System.out.println(list);
		//sorting
		Collections.sort(list);
		System.out.println(list);
		//remove
		list.remove(2);
		System.out.println(list);
		//get
		System.out.println(list.get(1));
		//for loop
		for(int i=0;i<list.size();i++) {
			System.out.println(i);
		}
		//for each
		System.out.println();
		for(String i:list) {
			System.out.print(i+" ");
		}
		//Iterator
		System.out.println();
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		
		
		
		

	}

}
