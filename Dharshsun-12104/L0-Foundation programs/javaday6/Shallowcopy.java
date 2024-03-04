package com.javaday6;

import java.util.HashMap;

public class Shallowcopy {
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String args[]) {
		HashMap <Integer,String> hs = new HashMap <Integer,String> ();
		  hs.put(1, "Red");
		  hs.put(2, "Green");
		  hs.put(3, "Black");
		  hs.put(4, "White");
		  hs.put(5, "Blue");
		  System.out.println("original:" +hs);
		  HashMap <Integer,String> hs1 = new HashMap <Integer,String> ();
		  hs1 = (HashMap)hs.clone();
		  System.out.println("clone" +hs1);
		  
	}

}
