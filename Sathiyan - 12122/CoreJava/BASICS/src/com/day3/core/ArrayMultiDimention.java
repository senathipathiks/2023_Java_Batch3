package com.day3.core;

import java.util.Arrays;

public class ArrayMultiDimention {

	public static void main(String[] args) {
		int x[][]= {
				{1,2,3},
				{1,2},
				{6,7,8,9,10}
		};
		
//		for (int i = 0; i < x.length; i++) {
//			for (int j = 0; j < x[i].length; j++) {
//				System.out.print(x[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(Arrays.toString(x[i]));
		}
	}

}
