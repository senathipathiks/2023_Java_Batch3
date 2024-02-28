package com.day1;

public class ArraySorting {

	public static void main(String args[]) {  
	String[] countries = {"Sathya", "Devil", "World", "Sandy"};  
	int[] numbers= {5,4,6,23,2};
	int tempnum=0;
	int size = countries.length; 
	System.out.print("Default String Array : ");
	for (int i = 0; i < countries.length; i++) {
		System.out.print(countries[i]+" ");
		
	}
	System.out.println();
	System.out.print("After Sorting String Array : ");
	for(int i = 0; i<size-1; i++){  
		for (int j = i+1; j<countries.length; j++){   
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
		System.out.println();
		
		System.out.print("Default Integer Array : ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");	
		}
		System.out.println();
		System.out.print("After Sorting Integer Array : ");
	for (int i = 0; i < numbers.length; i++) {
		for (int j = i+1; j < numbers.length; j++) {
			if (numbers[i]>numbers[j]) {
				tempnum=numbers[i];
				numbers[i]=numbers[j];
				numbers[j]=tempnum;
			}
		}
		System.out.print(numbers[i]+" ");
	}
	}  
} 
       
