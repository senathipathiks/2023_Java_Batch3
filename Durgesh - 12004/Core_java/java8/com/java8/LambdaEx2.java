package com.java8;

import java.util.ArrayList;
import java.util.Scanner;

public class LambdaEx2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of element in the list: ");
		int l = sc.nextInt();
		
		System.out.println("Enter the array list: ");
		for (int i = 0; i < l; i++) {
			list.add(sc.nextInt());
		}
		
//		for (Integer i : list) {
//			System.out.println(i + " ");
//		}
		
		list.forEach((a)->System.out.print(a+" "));
		sc.close();
	}

}
