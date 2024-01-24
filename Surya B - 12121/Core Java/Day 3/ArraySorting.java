package com.corejava.day3;
import java.util.*;

public class ArraySorting {
	public static void main(String[] args) {
		int arr[] = {3,7,1,9,30,8,2};

		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {

				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
		
	}



}
