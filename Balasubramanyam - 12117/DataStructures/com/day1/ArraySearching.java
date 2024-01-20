package com.day1;
import java.util.*;
public class ArraySearching {

	public static void main(String[] args) {
		
	int arr[]=new int[] {10,20,30,40,50};
	int k=0;
	boolean flag =false;
	Scanner sc = new Scanner(System.in);
	k=sc.nextInt();
	for(int i=0;i<arr.length;i++) {
		if(k==arr[i]) {
			System.out.println("elemenet fount at the index:"+i);
			flag=true;
			break;
		}
	}
	if (flag==false){
		System.out.println("element is not found");}
	sc.close();
      
}}
