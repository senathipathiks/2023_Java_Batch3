package com.Day_9;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> ref= new LinkedHashSet<String>();
		
		ref.add("sathiyan");
		ref.add("Gayathri");
		ref.add("Tamizh");
		ref.add("Valli");
		ref.add("Siva");
		
		System.out.println(ref);
		
		ref.remove("Siva");
		
		System.out.println(ref);

	}

}
