package com.javaday6;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
	public static void main(String args[]) {
		int[] arr = {2,6,1,8,3,7,9,};
		int high = arr.length-1;
		int low = 0;
	    boolean flag = false;
	    Arrays.sort(arr);
	    System.out.println("enter the element to search");
	    int elem = new Scanner(System.in).nextInt();
		while(low<high) {
			 int mid = low+high/2;
			  if(arr[mid] == elem) {
				  System.out.println("element found"+mid+"index");
				  flag = true;
				  break;
			  }else if(arr[mid]<elem) {
					low=mid+1;
				}
				else {
					high=mid-1;
				}
			}
			if(flag==false)
				System.out.println("Element Not found...!");
	}
}
