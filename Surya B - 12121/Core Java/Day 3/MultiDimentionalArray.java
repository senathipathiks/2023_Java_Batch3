package com.corejava.day3;

public class MultiDimentionalArray {
	public static void main(String[] args) {
		
		int jaggedArray[][]= {{1,2,3},{4,5},{6,7,8,9}};
		
		for (int i = 0; i < jaggedArray.length; i++) {
			for (int j = 0; j < jaggedArray[i].length; j++) {
			System.out.print(jaggedArray[i][j]+" ");	
			}
			System.out.println();
		}
		
	}

}
