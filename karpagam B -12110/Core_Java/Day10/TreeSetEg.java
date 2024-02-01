package Com.Day10;

import java.util.TreeSet;

public class TreeSetEg {
	public static void main(String[] args) {
		
    	TreeSet<Integer> set= new TreeSet<Integer>(); // using TreeSet
		
		set.add(10);
		set.add(20);
		set.add(50);
		set.add(30);
		set.add(30);  //doesn't allow duplictes

		System.out.println(set);  //in TreeSet elements are return in a sorted manner
		
		
	}

}
