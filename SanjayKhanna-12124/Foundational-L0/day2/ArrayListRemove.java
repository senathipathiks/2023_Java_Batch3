package com.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListRemove {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
			int listSize;
			System.out.println("Enter the List Size");
			listSize=sc.nextInt();
			System.out.println("Enter the List Elements ");				
			for(int i=0;i<listSize;i++) {
				list.add(sc.nextInt());											//Getting User Inputs
			}
			System.out.println("Enter the Element to remove");
			int elem=sc.nextInt();
			Iterator<Integer> it = list.iterator();								//Using Iterator Concept
			int i=0;
			while(it.hasNext()) {
				if(it.next()==elem) {
					list.remove(i);
					System.out.println("Element Removed ");
					break;
				}
				i++;
			}
			if(i==list.size()) {
				System.out.println("Element not Found..!");
			}
			else {
				System.out.println("After Removing : "+list);					//Output
			}
	}

}
