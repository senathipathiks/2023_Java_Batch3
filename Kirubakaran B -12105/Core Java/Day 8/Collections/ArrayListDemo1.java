package day5collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		ar.add(10);
		ar.add(50);
		ar.add(30);
		ar.add(20);
		ar.add(60);
		ar.add(40);
//		ar.addAll(ar);
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);
		ar.remove(5);
		System.out.println(ar);
		System.out.println(ar.get(2));
		
		for (int i = 0; i < ar.size(); i++) {
		     System.out.print(ar.get(i)+" ");	
		}
		
        System.out.println();
        for (Integer integer : ar) {
			System.out.print(integer+" ");
		}
        System.out.println();

       Iterator<Integer> itr=ar.iterator();
       while(itr.hasNext()) {
    	   System.out.print(itr.next()+" ");
       }
	}

}
