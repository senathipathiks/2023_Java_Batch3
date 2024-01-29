package day3j;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]=new int[3];
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		for(int i:n) {
			n[i]=sc.nextInt();
			sum=sum+n[i];
		}
		int avg=sum/n.length;
		System.out.println("Sum of the numbers :"+sum);
		System.out.println("Averge of the number:"+avg);
	}

}
