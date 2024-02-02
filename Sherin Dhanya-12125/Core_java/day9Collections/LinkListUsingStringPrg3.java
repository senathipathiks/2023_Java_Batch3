package com.day9Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkListUsingStringPrg3 {

	public static void main(String[] args) {
LinkedList<String> list= new LinkedList<String>();
list.add("sherin");
list.add("dhanya");
list.add("kiruba");
list.add("vino");
list.add("boomer");

System.out.println(list);
System.out.println("------------------------------");
Collections.sort(list);
System.out.println(list);
System.out.println("------------------------------");
list.remove(3);
System.out.println(list);
System.out.println("------------------------------");
System.out.println(list.get(2));

System.out.println("----------------------------");
System.out.println("Using For loop");
for(int i=0;i<list.size();i++) {
	System.out.println(list.get(i));
}
System.out.println("----------------------------");
System.out.println("Using For each loop");
for (String i:list) {
	System.out.println(i+" ");
}
System.out.println("----------------------------");
System.out.println("Using Iterator ");
Iterator<String> itr=list.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next()+" ");
	}

}}
