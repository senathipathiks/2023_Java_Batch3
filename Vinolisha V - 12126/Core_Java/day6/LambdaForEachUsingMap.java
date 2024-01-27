package com.day6;
import java.util.Scanner;
import java.util.HashMap;

public class LambdaForEachUsingMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		Scanner sc=new Scanner(System.in);
		int listSize;
		System.out.println("Enter the list size");
		listSize=sc.nextInt();
		System.out.println("Enter the key and elements");
		for(int i=0;i<listSize;i++) {
			int key=sc.nextInt();
			String elem=sc.next();
			map.put(key, elem);
			System.out.println(map);
		}
		
		System.out.println();
		System.out.println("Iterating Using for each:");
		//Iterating using for each
		map.keySet().forEach((i)->System.out.println(i+ " : " +map.get(i)));
		sc.close();
		
	}

}
