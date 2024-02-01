package rel.com.day10.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<String>();

		set1.add("hello");
		set1.add("this");
		set1.add("is");
		set1.add("Sundhar");
		set1.add("Raj");
		set1.add("from");
		set1.add("Relevantz");

//		for (String s : set) {
//			System.out.println(s);
//		}

		Iterator<String> i = set1.iterator();

		while (i.hasNext())
			System.out.print(i.next() + " ");

		System.out.println("\n----------------------------");

		Set<String> set = new LinkedHashSet<String>();

		set.add("hello");
		set.add("this");
		set.add("is");
		set.add("Sundhar");
		set.add("Raj");
		set.add("from");
		set.add("Relevantz");

//		for (String s : set) {
//			System.out.println(s);
//		}

		Iterator<String> it = set.iterator();

		while (it.hasNext())
			System.out.print(it.next() + " ");

		System.out.println("\n----------------------------");
		Set<String> s1 = new TreeSet<String>();

		s1.add("hello");
		s1.add("this");
		s1.add("is");
		s1.add("Sundhar");
		s1.add("Raj");
		s1.add("from");
		s1.add("Relevantz");

//		System.out.println(s1);
		s1.forEach((ss) -> System.out.print(ss + " "));
	}

}
