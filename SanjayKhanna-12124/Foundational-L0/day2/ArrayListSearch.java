package com.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListSearch {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
			int listSize;
			System.out.println("Enter the List Size");
			listSize=sc.nextInt();
			System.out.println("Enter the List Elements ");
			for(int i=0;i<listSize;i++) {
				list.add(sc.nextInt());
			}
			System.out.println("Enter the Element for Search");
			int elem=sc.nextInt();
			
			Iterator<Integer> it = list.iterator();
			int i=0;
			while(it.hasNext()) {
				if(it.next()==elem) {
					System.out.println("Element found at "+i+" position");
					break;
				}
				i++;
			}
			if(i==list.size()) {
				System.out.println("Element not Found..!");
			}
			
	}
}
