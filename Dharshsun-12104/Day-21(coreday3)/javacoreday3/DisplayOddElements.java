package com.coreday3;

public class DisplayOddElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{1,2,3,7,6,8,5,4,9};
		System.out.println("odd numbers");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}
	}

}
