package day_10;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist1 {

	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<Integer>();
		
		list.add(27);
		list.add(88);
		list.add(5);
		list.add(16);
		list.add(25);
		System.out.println(list);
		System.out.println(list.get(2));
		Collections.sort(list);
		System.out.println(list);
		System.out.println("After sorting "+list.get(2));
		list.remove(4);
		System.out.println(list);
		
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
