package com.day2;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Scanner;

public class ArrayListSample2 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
			int listSize;
			System.out.println("Enter the List Size");
			listSize=sc.nextInt();
			System.out.println("Enter the List Elements ");
			for(int i=0;i<listSize;i++) {
				//int val=sc.nextInt();
				//list.add(val);
				list.add(sc.nextInt());
			}
			//Collections.sort(list);
		System.out.println("List : "+list);

	}
}


