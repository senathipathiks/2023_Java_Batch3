package com.corecollection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LinkedList <String> list=new LinkedList<String>();
  list.add("vicky");
  list.add("kiruba");
  list.add("sanjai");
  list.add("vishnu");
  System.out.println(list);
  list.addAll(list);
  System.out.println(list);
  Collections.sort(list);
  System.out.println(list);
  list.remove(1);
  System.out.println(list);
  System.out.println(list.get(4));
  
  for(int i=0;i<list.size();i++) {
	  System.out.print(list.get(i)+" ");
  }
  System.out.println();
  for(String i:list)
  {
	  System.out.print(i+" ");
  }
  System.out.println();
  Iterator<String> it=list.iterator();
  while(it.hasNext())
  {
	  System.out.print(it.next()+" ");
  }
  
	}

}