package com.day23;

public class MultidimensionArray {

	public static void main(String[] args) {
		
		int arr[][] = {{1,2,3,4},{5,6},{7,8,9}};
		
		System.out.println("Array Elements:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}

}
