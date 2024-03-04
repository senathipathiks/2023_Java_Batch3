package com.day5;
import java.util.*;
public class Tset {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<> ();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(10);
//		for(Object i:set)
//		{
//			System.out.println(i);
//		}
//		System.out.println(set);
//		System.out.println(set.descendingSet());
//		System.out.println(set.first());
//		System.out.println(set.last());
//		System.out.println(set.pollFirst());
//        System.out.println(set.pollLast());
		boolean flag=false;
		System.out.println("Eneter the searching element: ");
		int k=new Scanner(System.in).nextInt();
		for(Integer i:set) {
			if(k==i) {
				flag=true;
				System.out.println("the searching elemenet is found:");
				break;
			}
		}
		if(flag==false) {
			System.out.println("the searching elemenet is NOT found:");
		}
		
		
		if(set.contains(k)) {
			System.out.println("the searching elemenet is found: ");}
		else {
			System.out.println("the searching elemenet is not found: "); 
		} 
       
	} 

}
