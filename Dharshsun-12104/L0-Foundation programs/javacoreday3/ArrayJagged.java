package com.javacoreday3;

public class ArrayJagged {
	public static void main(String s1[]) {
		int x[][] = {{1,2,3},{4,5},{6,7,8,9}};
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j]);
			}
			System.out.println();
		}
	}
}
