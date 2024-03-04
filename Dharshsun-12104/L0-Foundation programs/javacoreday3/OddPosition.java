package com.javacoreday3;

public class OddPosition {
	public static void main(String args[]) {
		int arr[] = new int[] {1,3,5,2,8};
		System.out.println("elements present in odd position");
		for(int i =0;i<arr.length;i=i+2){ //i=0 displays even
			System.out.println(arr[i]);
			
		}
		
	}

}
