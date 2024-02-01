package Java_Day_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(40);
		arr.add(30);
		arr.addAll(arr);
		System.out.println(arr);
		//Sorting
		Collections.sort(arr);
		System.out.println(arr);
		//remove the element
		arr.remove(4);
		System.out.println(arr);
		//to display the element
		System.out.println(arr.get(2));
		//remove all
//		arr.clear();
		//for loop
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
		}
		//for each
		System.out.println();
		for(Integer i:arr) {
			System.out.print(i+" ");
		}
		//Iterator
		System.out.println();
		Iterator<Integer> itr=arr.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		
		


	}

}
