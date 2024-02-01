package day_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist1 {

	public static void main(String[] args) {
		
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println("Sorted list is "+list);
		System.out.println(list.remove(2));
		System.out.println(list);
		System.out.println(list.get(3)+"\n");
//		list.clear();
//		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Iterator");
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		System.out.println("for each");
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
