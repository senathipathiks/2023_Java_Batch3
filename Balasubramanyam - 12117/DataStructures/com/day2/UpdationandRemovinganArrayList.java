package com.day2;
import java.util.*;
public class UpdationandRemovinganArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> alist =new ArrayList<Object>();
	    alist.add(10);
	    alist.add("java");
	    alist.add(20.7);
	    alist.add(10);
	    System.out.println(alist);
	    System.out.println(alist.get(0));
	    System.out.println(alist.remove(1));
	    System.out.println(alist);
	    System.out.println(alist.size());
	    alist.set(0,"Hello");
	    System.out.println(alist);
	    System.out.println();
	}

}
