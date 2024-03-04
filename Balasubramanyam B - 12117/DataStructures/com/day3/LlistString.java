package com.day3;
import java.util.*;
public class LlistString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Object> ll=new LinkedList<>();
		ll.add("Balu");
	    ll.add("Muniraj");
	    ll.add("Lokesh");
	    ll.add("surya");
	    ll.add("Mohan");
	    System.out.println(ll);
	    ll.add(0);
	    System.out.println(ll);
	    ll.addFirst("Ram");
	    ll.addLast("Charan");
	    System.out.println(ll);
	    ll.add(1,"Balu");
	    System.out.println(ll);
	    Iterator<Object> itr=ll.descendingIterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    System.out.println(ll);
	    LinkedList<Object>ll1=new LinkedList<>();
	    ll1.add("KIRAN");
	    ll1.add("2");
	    ll.addAll(ll1);
	    System.out.println(ll);
	    LinkedList<Object>ll2=new LinkedList<>();
	    ll2.add("Sunil");
	    ll2.addLast("Bala");
	    ll.addAll(5,ll2);
	    System.out.println(ll);
	    ll.removeAll(ll1);
	    System.out.println(ll);
	    ll.removeFirst();
	    System.out.println(ll);
	    ll.removeLast();
	    System.out.println(ll);
	}

}
