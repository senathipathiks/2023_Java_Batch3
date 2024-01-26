package Com.Day3;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
         int arr[]= {50,40,30,20,10};
         int temp=0;
         System.out.println(Arrays.toString(arr));// to display the elements in an array format
         System.out.println("Elements in ascending order:");
         for(int i=0;i<arr.length;i++) {
        	 for(int j=i+1;j<arr.length;j++) {
        		 if(arr[i]>arr[j]) {
        			 temp=arr[i];
        			 arr[i]=arr[j];
        			 arr[j]=temp;
        			 }
        	 }
        	 System.out.println(arr[i]);
         }
	}

}
//another method-->
//Arrays.sort(arr) 
//for(int i:arr){
// syso(i);}

