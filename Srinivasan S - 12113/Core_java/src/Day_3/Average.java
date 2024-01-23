package Day_3;

import java.util.Scanner;

public class Average {
	static int sum=0,avg=0;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();	
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			 sum=sum+arr[i];
	}
		avg=sum/n;
		System.out.println("The average of array is :"+avg);

  }
}
