package com.java2;

import java.util.ArrayList;

public class MyList {
  public static void main(String args[]) {
	  ArrayList<Integer> list = new ArrayList<Integer>();
	  list.add(10);
	  list.add(40);
	  list.add(4543);
	  list.add(10);
	  System.out.println(list);
	  System.out.println(list.get(0));
	  list.remove(1);
	  System.out.println(list);
	  System.out.println(list.size());//3
	  list.set(0, 20);
	  System.out.println(list);
  }
}