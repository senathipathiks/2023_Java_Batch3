package com.day1;

public class DuplicateElementfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,7,9,3,2,8,8};
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1;j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.print("There is a Duplicate for: " + arr[j]);
				}
				}
			}
	}

}