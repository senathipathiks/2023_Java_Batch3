

package Day10Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);a.add(1);
		a.add(6);	a.add(7);	a.add(10);
		a.add(67);
		a.add(98);
//		a.addAll(a); // add all elements to the array
//		System.out.println(a);
		Collections.sort(a);   /// to sort the array
		System.out.println(a);
		// to remove the index value
		a.remove(4);
		System.out.println(a);
		
		// to get the index value
		System.out.println(a.get(1));
		
		// to remove the all elements clear() method
//		a.clear();
//		System.out.println(a);
		
		// to remove the all elements
//		a.removeAll(a);
//		System.out.println(a);
		
		// to iterate the elements using normal for loop
		System.out.println("to iterate the elements using normal for loop");
		for (int i=0; i<a.size();i++) {
			System.out.print(" "+a.get(i)+"\n");
		}
		// to iterate the elements using  for each loop
		System.out.println("to iterate the elements using  for each  loop");
		for(Integer i:a) {
			System.out.print(" "+i);
		}
		// to iterate the elements using  Iterator 
		System.out.println("to iterate the elements using  Iterator ");
		Iterator<Integer> itr=a.iterator();
		while(itr.hasNext()) {
			System.out.print(" "+itr.next());
		}
		
		
		}

}
