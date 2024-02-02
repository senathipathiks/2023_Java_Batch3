package day5collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> str=new LinkedList<String>();
		str.add("kiruba");
		str.add("sirini");
		str.add("sundhar");
		str.add("jothi");
		str.add("abishek");
		str.add("prem");
		System.out.println(str);
		Collections.sort(str);
		System.out.println(str);
		str.remove(3);
		System.out.println(str);
		for (int i = 0; i < str.size(); i++) {
		            System.out.print(str.get(i)+" ");	
		}
		
		
		

	}

}
