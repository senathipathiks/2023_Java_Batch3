package Day3;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int arr[] = { 80, 30, 50, 250, 60 };
		System.out.println("Before sorting a array:");
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("After sorting a array");
		Arrays.sort(arr);
		for (int i : arr) {

			System.out.println(i);
		}

	}

}
