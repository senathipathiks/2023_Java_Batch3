package CorejavaDay10;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionEx2LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> arr=new LinkedList<String>();
		arr.add("Venkat");
		arr.add("Mohanambal");
		arr.add("Vishnu");
		arr.add("Surya");
		arr.add("Aarthika");
		//arr.addAll(arr);
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		arr.remove(2);
		System.out.println(arr);
		System.out.println(arr.get(2));
//		arr.clear();
//		System.out.println(arr);
		
		for (int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
		}
		
		System.out.println();
		for (String i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		Iterator<String> itr=arr.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}
	
}
