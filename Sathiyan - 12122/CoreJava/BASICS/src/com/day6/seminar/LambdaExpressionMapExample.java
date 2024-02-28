package com.day6.seminar;

import java.util.*;

public class LambdaExpressionMapExample {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		HashMap<Integer, String> arr=new HashMap<Integer,String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int i=sc.nextInt();
		System.out.println("Enter the elements: ");
		
		for (int j = 0; j < i; j++) {
			arr.put(sc.nextInt(), sc.next());
		}
		
		arr.keySet().forEach(ele->System.out.println(ele +" "+arr.get(ele)));	
		
	}

}
