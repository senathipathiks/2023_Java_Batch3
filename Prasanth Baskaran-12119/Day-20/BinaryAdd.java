package com.Day2;

import java.util.Scanner;

public class BinaryAdd {
	
	
	

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first Binary val :");
		
		String b1 = sc.nextLine();
		
		System.out.println("Enter Second Binary val :");
		
		String b2 = sc.nextLine();
		
		int arr[]= new int[10];
		
		arr = binaryAdd(b1.toCharArray(),b2.toCharArray());
		
	    for (int i : arr) {
			System.out.print(i);
		}
		
		
		
		
		
	}

	public static int[] binaryAdd(char[] cs, char[] cs2) {
	    int[] added = new int[8];
	    int remain = 0;
	    //System.out.println(cs.length);
	    for (int x = added.length - 1; x >= 0; x--) {
	        added[x] = (cs[x] + cs2[x] + remain) % 2;
	        remain = (cs[x] + cs2[x] + remain) / 2;
	    }
	    if (remain!=0) {
	        System.out.println("Error: overflow");
	    }
	    return added;
	}
}
