package com.java1;
import java.util.Arrays;
public class CopyArray {
	public static void main(String args[]) {
		int[] my_array = {23,54,12,78,12};
		int[] new_array = new int[5];
		
		System.out.println("Source:" +Arrays.toString(my_array));
		for(int i = 0; i< my_array.length; i++) {
			new_array[i] = my_array[i];
			System.out.println("new array"+Arrays.toString(new_array));
		}
	}

}
