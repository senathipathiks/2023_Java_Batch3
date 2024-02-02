package Day3;

import java.util.Scanner;

public class ex1mrng {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[10];
		
		System.out.println("Enter the array values");
//		int n=sc.nextInt();
//		int sum=0;
		for (int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
//			sum=sum+arr[i];
		}
//		jSystem.out.println(sum);
		
//		for(int i: arr) {
//			System.out.println(i);
//		}
		
		int sum1=0;
		
		for(int s: arr) {
			
			System.out.println(s);
			sum1=sum1+s;
		}
		System.out.println("sum of Array : "+sum1);
		
		float avg=sum1/arr.length;
		System.out.println("Average of array"+ avg);
		

	}

}
