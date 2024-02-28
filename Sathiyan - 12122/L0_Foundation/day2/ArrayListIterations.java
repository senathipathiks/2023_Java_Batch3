package com.day2;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListIterations {
	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("list: "+list);
		//way1
		System.out.println("Way-1");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}	
		//way2
		System.out.println();
		System.out.println("Way-2");
		for (Object i : list) {
			System.out.print(i+" ");
		}
		//way3
		System.out.println();
		System.out.println("Way-3");
		Iterator<Object> it=list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() +" ");
		}
	}
}
