package com.day8adv;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> st = new HashSet<String>();
		st.add("Abishek");
		st.add("Lee");
		st.add("King");
		st.add("Emperor");
		System.out.println(st);
		st.remove("King");
		System.out.println(st.size());

		for(String i:st)
		{
			System.out.println(i);
		}
		
		Iterator <String> it=st.iterator();
		
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	
	
	}

}
