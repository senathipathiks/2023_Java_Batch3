package com.day3;
import java.util.*;
public class EvenOddElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll =new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.add(8);
		ll.add(9);
		ll.add(10);
		LinkedList<Integer> evenll =new LinkedList<>();
		LinkedList<Integer> oddll =new LinkedList<>();
		for(int i=0;i<ll.size();i++)
		{  Integer t = ll.get(i);
		  if(t%2==0)
			  evenll.add(t);
		  else
			  oddll.add(t);
		}
		System.out.println("even Linkedlist is:"+evenll);
		System.out.println("odd Linkedlist is:"+oddll);
	}

}
