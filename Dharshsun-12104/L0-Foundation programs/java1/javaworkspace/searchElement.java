package com.java1;

import java.util.Scanner;

public class searchElement {
    public static void main(String args[]) {
    	int arr[] = {10,20,30,40,50};
    	int k = 0;
    	boolean flag = false;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the element");
    	k = sc.nextInt();
    	
    	for(int i = 0;i<arr.length;i++) {
    		if(k == arr[i]) {
    			System.out.println("element found at the index" +i );	
    			flag = true;
    			break;
    		}
    	}
    	
    	if(flag == false) {
    		System.out.println("element not found");
    	}
    }
}
