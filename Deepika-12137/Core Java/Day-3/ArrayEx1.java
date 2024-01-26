package com.day3;
import java.util.Arrays;
public class ArrayEx1 {
public static void main(String[] args) {
	int arr[]= {10,20,30,40,50};
	String [] foods = {"Tomato rice","Curd rice","dal rice"};
	System.out.println(arr.length);
	//for (int i = 0; i < arr.length; i++) //for loop
	{
	//	System.out.println(arr[i]);
	}
	for (int i : arr) {
		System.out.println(i);
	}
	for (String string : foods) {
		System.out.println(string);
		
	}
}
}
