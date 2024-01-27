package com.day3;
import java.util.*;
public class StringReverse {
       public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String a = sc.nextLine();
		String arr[]=a.split(" ");
		StringBuffer sb = new StringBuffer("HI ");
		for(int i=arr.length-1;0<=i;i--) {
			sb.append(arr[i]);
			sb.append(" ");
		}
//		char[] name=N.toCharArray();
//		for(int i=name.length-1;i>=0;i--) {
//			System.out.print(name[i]);
//		}
		System.out.println(sb);
	}
}
