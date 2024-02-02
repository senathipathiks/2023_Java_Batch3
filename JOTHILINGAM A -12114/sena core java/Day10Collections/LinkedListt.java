package Day10Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListt {

	public static void main(String[] args) {
		
		LinkedList<String> ls=new LinkedList<String>();
		
		ls.add("GJothi");
		ls.add("GFjo");
		ls.add("GJothi");
		ls.add("BJothi");
		ls.add("HJothi");
		ls.add("HJothi");
		ls.add("RJothi");
		ls.add("RJothi");
		ls.add("JUothi");
		
		Collections.sort(ls);   /// to sort the array
		System.out.println(ls);
		// to remove the index value
		ls.remove(4);
		System.out.println(ls);
		
		// to get the index value
		System.out.println(ls.get(1));
		
		// to remove the all elements clear() method
//		ls.clear();
//		System.out.println(ls);
		
		// to remove the all elements
//		ls.removeAll(ls);
//		System.out.println(ls);
		
		// to iterate the elements using normal for loop
		System.out.println("to iterate the elements using normal for loop");
		for (int i=0; i<ls.size();i++) {
			System.out.print(" "+ls.get(i)+"\n");
		}
		// to iterate the elements using  for each loop
		System.out.println("to iterate the elements using  for each  loop");
		for(String i:ls) {
			System.out.print(" "+i);
		}
		// to iterate the elements using  Iterator 
		System.out.println("to iterate the elements using  Iterator ");
		Iterator<String> itr=ls.iterator();
		while(itr.hasNext()) {
			System.out.print(" "+itr.next());
		
		
		

	}

}
}
