package day5collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		
		set.add("kiruba");
		set.add("sirini");
		set.add("sundhar");
		set.add("jothi");
		set.add("abishek");
		set.add("sundhar");
		set.add("prem");
		System.out.println(set);
		
		set.remove("prem");
		System.out.println(set);
		for (String st : set) {
			System.out.print(st+" ");
		}

	}

}
