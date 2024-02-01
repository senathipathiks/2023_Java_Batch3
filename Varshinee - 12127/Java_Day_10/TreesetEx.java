package Java_Day_10;

import java.util.TreeSet;
import java.util.Iterator;

public class TreesetEx {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();
		set.add("Varshi");
		set.add("Varshinee");
		set.add("Appu");
		set.add("Sandy");
		set.add("Subi");
		System.out.println(set);
		set.remove("Varshinee");
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

