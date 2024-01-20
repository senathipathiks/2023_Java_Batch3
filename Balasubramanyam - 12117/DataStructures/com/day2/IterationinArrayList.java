package com.day2;
import java.util.*;

public class IterationinArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Object> alist =new ArrayList<Object>();
	    alist.add(10);
	    alist.add("java");
	    alist.add(20.7);
	    alist.add(10);
	    System.out.println(alist);
    Iterator<Object> itr = alist.iterator();
    while(itr.hasNext()){ 
    	System.out.println(itr.next());}
    System.out.println();
    
    for(int i=0;i<alist.size();i++) {
    	System.out.println(alist.get(i));	}
    
    System.out.println();
    
    for(Object i : alist) {
    	System.out.println(i);}
      
	}}

