package com.day3;

public class Array {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		String str[]= {"abi","prem","vishnu","loki"};
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
         
		//for-each
		System.out.println("**********************");
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("*************************");
		for(String i:str) {
			System.out.println(i);
		}
	}

}
