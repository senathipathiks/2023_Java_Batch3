package com.javaday6;

import java.util.HashMap;

public class HashMapEmptyorNot {
	public static void main(String args[]) {
	HashMap <Integer,String> hs = new HashMap <Integer,String> ();
	  hs.put(1, "Red");
	  hs.put(2, "Green");
	  hs.put(3, "Black");
	  hs.put(4, "White");
	  hs.put(5, "Blue");
	  // check if map is empty
	  boolean result = hs.isEmpty();
	  // check the result
	  System.out.println("Is hash map empty: " + result);
	  // Removing all the elements from the linked map
	  hs.clear();
	  // check if map is empty
	  result = hs.isEmpty();
	  // check the result
	  System.out.println("Is hash map empty: " + result);

}
}
