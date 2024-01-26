package rel.day3.array;

import java.util.Arrays;
import java.util.Scanner;

public class SumAndAvgArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		int sum = 0;
		
		int [] copyArray = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter element " +i);
			arr[i] = sc.nextInt();
			copyArray[i] = arr[i];
			sum+=i;
		}
		
		//sum
		
		
//		for (int i : arr) {
//			
//		}
		
		System.out.println("sum of the array elemnest is "+sum);
		System.out.println("average of the array elemengts is "+ (sum/arr.length));
		
		//Copy of the array
		System.out.println("the copy of the array"+ Arrays.toString(copyArray));
		
	}

}
