package com.day3;

import java.util.*;

public class RemoveDuplicatesfromStack {

	public static void main(String[] args) {
	Stack<Integer> ll =new Stack<>();
		
		ll.add(10);
		ll.add(20);
		ll.add(10);
		ll.add(40);
		ll.add(50);
		ll.add(40);
		ll.add(70);
		ll.add(80);
		ll.add(90);
		ll.add(10);
		System.out.println(ll);
		for(int i=0;i<ll.size();i++) {
			for(int j=i+1;j<ll.size();j++) {	
				if(ll.get(i)==ll.get(j))
				ll.remove(j);
				
			}}System.out.println(ll);
			
	    
	    
	
	}
}

	
	

	
