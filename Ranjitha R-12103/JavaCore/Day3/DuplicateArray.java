//Find a duplicate array 
package Day3;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " + n + " elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			for (int k = j + 1; k < arr.length; k++) {
				if (arr[j] == arr[k]) {
					System.out.println(arr[j]);
				}
			}
		}

	}

}
