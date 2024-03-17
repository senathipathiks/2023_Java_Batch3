package com.corecollection;

import java.util.HashSet;
import java.util.Iterator;

public class HasSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashSet<String> set=new HashSet<String>();
      set.add("Gowtham");
      set.add("Rajesh");
      set.add("sena");
      set.add("valan");
      
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
