package Java_Day_10;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
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
