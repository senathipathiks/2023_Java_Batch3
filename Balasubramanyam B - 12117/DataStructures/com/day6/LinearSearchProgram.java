package com.day6;
import java.util.*;
public class LinearSearchProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {1,2,3,4,5,6};
    boolean flag=false;
    System.out.println("Enter the searching element: ");
    int k=new Scanner(System.in).nextInt();
    
    for(int i=0;i<arr.length;i
    		++) {
    	if(k==arr[i]) {
    		System.out.println("Element fount at : "+i);flag=true;break;
    	}
    }
    if(flag==false) {
    	System.out.println("Element is not fount ");
    }
	}

}
