package com.day1;

import java.util.Scanner;

public class IndexofArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {10,20,30,40,50};
		boolean flag =false;
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(k==arr[i]) {
				System.out.println("the index of an array element is :"+i);
				flag=true;
				break;
			}
		}
		if (flag==false){
			System.out.println("the index of an array element is not found:");}
		sc.close();
	}

}
