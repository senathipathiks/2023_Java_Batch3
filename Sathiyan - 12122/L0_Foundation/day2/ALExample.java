package com.day2;
import java.util.*;
public class ALExample {

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
		sc.close();
	}
}
