package Day10;

import java.util.HashSet;
import java.util.Iterator;

public class HastsetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("Arun");
		set.add("Kumar");
		set.add("Ram");
		System.out.println(set);
		set.remove("Kumar");
		System.out.println(set);
		System.out.println(set.size());

		for (String i : set) {
			System.out.print(i+" ");
		}

		System.out.println();
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}
