package day_10;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {

	public static void main(String[] args) {
		HashSet<String>set=new HashSet<String>();
		set.add("Srini");
		set.add("Dravid");
		set.add("Virat");
		set.add("Rohit");
		set.add("Virat");
		set.add(null);
		
		System.out.println(set);
		set.remove("Rohit");
		System.out.println(set);
		
		for (String string : set) {
			System.out.println(string);
		}
		System.out.println("\nIterator\n");
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}

	}

}
