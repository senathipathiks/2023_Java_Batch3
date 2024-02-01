package Com.Day10;

import java.util.*;

public class ArrayListEg {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(13);
		list.add(12);
		list.add(11);
		list.add(14);
		list.add(15);
//		list.addAll(list); // to print the same element twice 
		System.out.println(list);//to print the elements in the list
		
		System.out.println("-------------");
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("--------------");
		list.remove(4);
		System.out.println(list);
		
		System.out.println("--------------");
		System.out.println(list.get(2));
		
		System.out.println("--------------");//traversing using for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)+ " ");
		}
		
		System.out.println("--------------");
        for (Integer i : list) {
			System.out.println(i+" ");
		}
       
		System.out.println("--------------");//traversing using iterator
        Iterator<Integer> itr=list.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
		

		

	}

}
