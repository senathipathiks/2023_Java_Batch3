package com.javacoreday3;

public class ArraySort {
	public static void main(String[] args) {
        String[] countries = {"Apple","Zebra","Banana","Child"};  
//           int[] numbers= {};
           int size = countries.length;  
           for(int i = 0; i<size-1; i++){  
               for (int j = i; j<countries.length; j++){   
                   if(countries[i].compareTo(countries[j])>0){   
                       String temp = countries[i];  
                       countries[i] = countries[j];  
                       countries[j] = temp;  
                       }  
                   }  
               }  
               for (int i = 0; i < countries.length; i++) {
                   System.out.print(countries[i]+" ");
               }  
           }  
}
