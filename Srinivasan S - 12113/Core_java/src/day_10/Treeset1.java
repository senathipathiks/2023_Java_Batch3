package day_10;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset1 {

	public static void main(String[] args) {
		TreeSet<Integer>t=new TreeSet<Integer>();
		
		t.add(1);
		t.add(1);
		t.add(5);
		t.add(3);
//		t.add(null); null cannot be allowed
		System.out.println(t);
		t.remove(5);
		
		for (Iterator iterator = t.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		System.out.println("\n");
		for (Integer integer : t) {
			System.out.println(integer);
		}
	}

}
