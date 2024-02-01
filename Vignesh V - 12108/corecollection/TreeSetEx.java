package com.corecollection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TreeSet<String> set=new TreeSet<String>();
    set.add("Gowtham");
    set.add("Rajesh");
    set.add("sena");
    set.add("Anu");
    
    System.out.println(set);
    set.remove("valan");
    System.out.println(set);
    
    for(String i:set)
    {
  	  System.out.print(i+" ");
    }
    System.out.println();
    
    Iterator<String> it=set.iterator();
    while(it.hasNext())
    {
  	  System.out.print(it.next()+" ");
    }
	
	}
}
