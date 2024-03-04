package com.day3;
import java.util.*;
public class LListIterations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedList<Integer> ll =new LinkedList<>();
    ll.add(10);
    ll.add(20);
    ll.add(30);
    ll.add(40);
    System.out.println(ll);
    System.out.println(ll.get(0));
    ll.remove(0);
    ll.set(0, 90);
    System.out.println(ll);
    
    
    for(int i=0;i<ll.size();i++) {
    	System.out.println(ll.get(i));
    }
    System.out.println();
    
    for(Integer i:ll) {
    	System.out.println(i);
    }
    System.out.println();
    
    Iterator<Integer> it=ll.iterator();
    while(it.hasNext()) {
    	System.out.println(it.next());
    }	
			}}
