package com.day23;

public class ArrayExample1 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		String[] str = { "SanjayKhanna", "Vignesh", "Vishnu", "Prasanth", "Surya"};
		
		System.out.println("Array Length : "+arr.length);
		
		System.out.print("Array Elements : ");
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
		
		System.out.print("String Array Length : "+str.length);
		
		System.out.print("\nArray Elements : ");
		
		for(String s : str)
			System.out.print(s+" ");

	}

}
