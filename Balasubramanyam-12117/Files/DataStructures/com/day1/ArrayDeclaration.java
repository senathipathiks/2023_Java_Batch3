package com.day1;
public class ArrayDeclaration {
     public static void main(String[] args) {
    	 int arr[]=new int[] {1,2,3,4,5};
    	 System.out.println("Array elements are:");
    	 for(int i=0;i<arr.length;i++) {
    	 System.out.println(arr[i]);}
    	 
    	 int aRR[]={1,2,3,4,5};
    	 System.out.println("Array elements are:");
    	 for(int i:aRR) {
    	 System.out.println(i);}
    		
     }
     
}
