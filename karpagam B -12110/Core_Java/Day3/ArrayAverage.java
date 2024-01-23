package Com.Day3;

import java.util.Scanner;

public class ArrayAverage {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = sc.nextInt();
        
        int a[] = new int[n];
        System.out.print("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
            sum=sum+a[i];
        }
        int avg = sum/a.length;
        System.out.println("Average is:"+avg);

 }

}
