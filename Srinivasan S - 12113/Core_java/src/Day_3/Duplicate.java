package Day_3;


import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Duplicate Elements are:");
		for (int j = 0; j < arr.length; j++) {
			for (int k = j+1; k < arr.length; k++) {
				if(arr[j]==arr[k])
					System.out.println(arr[j]);
				
			}
		}

	}

}
