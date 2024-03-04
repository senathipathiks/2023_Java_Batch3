package com.day1;
import java.util.*;
public class RemoveElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,6,7,8,9};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("element you want to remove:");
		int k=sc.nextInt();
		for (int i=0;i<arr.length;i++){
			if(k==arr[i]) {
				arr[i]=0;
				break;
				
			}
		}
		System.out.println("updated Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}sc.close();
	}

}
