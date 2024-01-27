package com.day6.seminar;

import java.util.*;

public class LambdaExpressionExample2 {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int i=sc.nextInt();
		System.out.println("Enter the elements: ");
		for (int j = 0; j < i; j++) {
			arr.add(sc.nextInt());
		}
		
		//Using for each loop
		for (Integer integer : arr) {
			System.out.print(integer +" ");
		} 
		System.out.println();
		
		//Using lambda function
		
		arr.forEach((n)->System.out.print(n+" "));
		sc.close();
	}

}
