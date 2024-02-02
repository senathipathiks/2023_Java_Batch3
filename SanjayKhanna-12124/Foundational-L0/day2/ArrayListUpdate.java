package com.day2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUpdate {

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
			System.out.println("Enter the Position and element : ");
			int pos = sc.nextInt();
			int elem=sc.nextInt();
			list.set(pos, elem);
			System.out.println("After Updating ");
			System.out.println("List : "+list); 

	}

}
