package com.java8;

import java.util.HashMap;
import java.util.Scanner;

public class LambdaEx3 {

	public static void main(String[] args) {
		HashMap<Integer, String> fruit = new HashMap<Integer, String>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of hashmap: ");
		int size = sc.nextInt();
//		
		System.out.println("Enter the fruits: ");
		for (int i = 0; i < size; i++) {
				int key = sc.nextInt();
				String elm = sc.next();
				fruit.put(key, elm);
		}
		
        System.out.println("");
        fruit.keySet().forEach((d)->System.out.print(d+ " : " + fruit.get(d)));
        sc.close();
	}

}
