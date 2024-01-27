package com.Basic;
import java.util.*;
public class IntToBin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer num: ");
		int k = sc.nextInt();
	    String bin="";
		while(k>0) {
			int rem=k%2;
			bin=bin+rem;
			k=k/2;
		}
		System.out.println(bin);
	}

}
