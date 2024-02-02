package Day10;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedDemo1 {

	public static void main(String[] args) {
		LinkedList<String> list =new LinkedList<String>();
		list.add("Ranjitha");
		list.add("Sowmiya");
		list.add("Vino");
		list.add("varshsini");
		System.out.println(list);
		list.addAll(list);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		System.out.println(list.get(2));
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		for(String i:list) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		

	}

	
	}


