package com.javaday6;

import java.util.HashMap;
import java.util.Set;

public class SetKeyView {
	public static void main(String args[]) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"Red");
		hm.put(2,"Green");
		hm.put(3,"Black");
		hm.put(4,"White");
		hm.put(5,"Blue");
		  
		  // get keyset value from map
		   Set keyset = hm.keySet();
		      
		  // check key set values
		   System.out.println("Key set values are: " + keyset);
	}
}

