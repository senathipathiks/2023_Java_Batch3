package com.day2;
import java.util.*;
public class ALSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		
		System.out.println("Enter the total number of element: ");
		int n=sc.nextInt();
		System.out.println("Enter " +n+ " Elements");
		for (int i = 1; i <= n; i++) {
			list.add(sc.nextInt());
		}
		System.out.println("You are Entered: " +list);
		
		int flag=0;
		System.out.print("Enter the element you want to search : ");
		int input=sc.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (input==list.get(i)) {
				flag++;
				System.out.println("Element found at : "+i);
				break;
			}
		}
		if (flag==0) {
			System.out.println("Element Not Found");
		}
		sc.close();
	}
}
