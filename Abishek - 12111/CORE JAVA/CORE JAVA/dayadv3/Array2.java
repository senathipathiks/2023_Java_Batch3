package com.dayadv3;



public class Array2 {

    public static void main(String[] args) {
        int arr[] = {8,7,6,5,4,3,2,1};
        int arr1[]=new int[8];
        System.out.println("Original Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            arr1[i]=arr[i];
        }    
        
        System.out.println();
        System.out.println("Copy Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        
    }

}
