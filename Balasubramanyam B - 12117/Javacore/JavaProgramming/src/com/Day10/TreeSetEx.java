package com.Day10;
import java.util.*;
public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();
		set.add("Loki");
		set.add("Mahesh");
		set.add("Mun iraj");
		set.add("Ram");
		set.add("Balu");
		System.out.println(set);
		set.remove("Loki");
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
