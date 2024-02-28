package com.day3;
import java.util.*;
public class LLsample4 {
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.add(19);
		ll.add(20);
		ll.add(21);
		ll.add(30);
		ll.add(40);
		ll.add(13);
		
		
		System.out.println(ll);		
		//Reverse the Linked List
		LinkedList<Integer> reverseList=new LinkedList<>();
		for (int i = ll.size()-1; i >= 0; i--) {
			int t=ll.get(i);
			reverseList.add(t);			
		}
		System.out.println(reverseList);
		
		LinkedList<Integer> evenList=new LinkedList<>();
		LinkedList<Integer> oddList=new LinkedList<>();
		for (int i = 0; i < ll.size(); i++) {
			int t=ll.get(i);
			if (t%2==0) {
				evenList.add(ll.get(i));
			}
			else {
				oddList.add(ll.get(i));
			}
		}
		System.out.println("Even numbers : "+evenList);
		System.out.println("Odd numbers : "+oddList);
	}
}
