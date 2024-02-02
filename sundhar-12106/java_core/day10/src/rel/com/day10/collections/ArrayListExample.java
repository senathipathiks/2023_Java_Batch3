package rel.com.day10.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
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
		System.out.println(arr.get(4));
//		arr.clear();
		System.out.println(arr);
		
		Iterator<Integer> i = arr.iterator();
		
		while(i.hasNext())
			System.out.println(i.next());
		
		
		for (Integer i1 : arr) 
			System.out.print(i1 + " : ");
		
		System.out.println("\n");
		arr.forEach((j)->{
			System.out.println(j+" - "+(char)3);
		});
	}

}
