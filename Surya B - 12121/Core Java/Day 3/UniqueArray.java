package com.corejava.day3;

public class UniqueArray {
	public static void main(String[] args) {
		
		        int [] arr = {3,5,7,7,5,98,67,5};
		       
		        System.out.println("Elements other than duplicate are: ");
		        for(int i=0;i<arr.length;i++) {
		            boolean dup = false;
		            for(int j=0;j<arr.length;j++) {
		                if(i!=j && arr[i]==arr[j]) {
		                    dup=true;
		                    break;
		                }
		            }
		            if(!dup) {
		            
		                System.out.println(arr[i]);
		            }
		        }
		
	}

}
