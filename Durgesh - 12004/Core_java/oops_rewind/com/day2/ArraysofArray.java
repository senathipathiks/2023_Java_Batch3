package com.day2;

//import java.util.Arrays;

public class ArraysofArray {

	public static void main(String[] args) {
		
		int l[][] = {{1,2,3},
				{38,65},
				{4,5,6}
	};
		for (int i=0; i < l.length; i++) {
			for (int j=0; j < l[i].length; j++) {
				System.out.println(l[i][j]);
//				System.out.println(Arrays.toString(l[i]));
			}
			System.out.println();
		}

}
}
