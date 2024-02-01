package rel.com.day10.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Virat");
		ll.add("MSD");
		ll.add("Raina");
		ll.add("Faf Duplesis");
		ll.addAll(ll);
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);
		ll.remove(4);
		System.out.println(ll);
		System.out.println(ll.get(4));
//		arr.clear();
		System.out.println(ll);
		
		Iterator<String> i = ll.iterator();
		
		while(i.hasNext())
			System.out.println(i.next());
		
		for (String i1 : ll) 
			System.out.print(i1 + " : ");
		
		
		ll.forEach((j)->{
			System.out.println(j+" - "+(char)3);
		});
	}

}
