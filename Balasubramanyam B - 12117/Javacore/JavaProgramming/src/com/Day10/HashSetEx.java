package com.Day10;
import java.util.*;
public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("Balu");
		set.add("Lokesh");
		set.add("Muni");
		set.add("Ashokan");
		set.add("Mano");
		System.out.println(set);
		set.remove("Muni");
		System.out.println(set.size());
		
		for(String i:set)
		{
			System.out.println(i);
		}
		
		Iterator <String> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}