package day3j;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]=new int[3];
		int arr[]=new int[n.length];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		for (int i = 0; i < n.length; i++) {
			n[i]=sc.nextInt();
		}
		for (int i1 : n) {
			System.out.println(i1);
			arr[i1]=n[i1];
		}
//		for (int i3 : arr) {
//			System.out.println("copy of array");
//			System.out.println(arr[i3]);
//			
//		}
		
		
		

}
}
