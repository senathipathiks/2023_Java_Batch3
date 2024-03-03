package com.day6;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {1,8,2,4,5,6,7,3,9};
    int l=0;
    int h=arr.length-1;
    Arrays.sort(arr);
    System.out.println("Enter the searching element: ");
    int k=new Scanner(System.in).nextInt();
    boolean flag=false;
    while(l<=h) {
    	int mid=(l+h)/2;
    	if(k==arr[mid]) {
    		System.out.println("the element is found");
    		flag=true;
    		break;
    	}
    	else if(k<arr[mid]) {
    		h=mid-1;}
    	else {
    		l=mid+1;
    	}
    }
    if(flag==false) {
    	System.out.println("the element is not found");
    }
    
	}

}
