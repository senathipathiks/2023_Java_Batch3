package com.day1;

public class AverageOfArray {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			sum=sum+array[i];
		}
		sum=sum/array.length;
		System.out.println(sum);

	}

}
