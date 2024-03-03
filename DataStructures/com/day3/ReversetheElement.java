package com.day3;
import java.util.*;
public class ReversetheElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll =new LinkedList<>();
	    ll.add(32);
	    ll.add(93);
	    ll.add(54);
	    ll.add(12);
	    ll.add(63);
	    ll.add(62);
	    LinkedList<Integer> reverse=new LinkedList<>();
	    for(int i=ll.size()-1;i>=0;i--) {
	    	Integer t=ll.get(i);
	    	reverse.add(t);
	    	
	    }System.out.println(reverse);
	}

}
