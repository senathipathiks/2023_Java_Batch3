package com.day26.java8;

import java.util.HashMap;
import java.util.Scanner;

public class LambdaExample3 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		int listSize;
		System.out.println("Enter the Map Size");
		listSize=sc.nextInt();
		System.out.println("Enter the Keys and Elements ");
		for(int i=0;i<listSize;i++) {
			int key = sc.nextInt();
			int elem = sc.nextInt();
			map.put(key, elem);
		}
		System.out.println("Iterating Using For each: ");
		//Iterating using for each
		map.keySet().forEach((i)->System.out.println(i+" : "+map.get(i)));
		sc.close();
	}

}
