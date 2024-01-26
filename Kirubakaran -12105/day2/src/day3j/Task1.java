package day3j;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] { 12, 13, 14, 15, 12, 13, 16 };
		int temp =0;
		int c=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				else if(a[i]==a[j]) {
					c++;
					System.out.println("Duplicate values are:");
					System.out.println(a[i]);
					System.out.println();
				}
				
				
			}
			

		}
		System.out.println("Sorting Array"+Arrays.toString(a));
		System.out.println("Total duplicate values are :"+c);

	}

}
