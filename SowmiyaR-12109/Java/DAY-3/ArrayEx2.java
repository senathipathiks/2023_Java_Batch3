package Day3;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		int n,avg,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements:");
		 n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter"+n+"elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			 sum=sum+arr[i];
			}
		avg=sum/arr.length;
		System.out.println("average: "+avg);
	
		

	}

}
