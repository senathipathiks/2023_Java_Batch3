package Day_3;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();
		int arr[]= new int [n];
		System.out.println("Enter the elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
			Arrays.sort(arr);	
		System.out.println(Arrays.toString(arr));

	}

}
