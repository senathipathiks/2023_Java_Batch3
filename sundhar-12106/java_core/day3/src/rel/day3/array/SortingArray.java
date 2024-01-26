package rel.day3.array;

import java.util.Arrays;

public class SortingArray {
	
	public static void main(String[] args) {
		
		int []arr = {9,8,7,6,5,4,3,2,1};
		
		int []arr1 = new int[arr.length];
		
		System.arraycopy(arr, 0, arr1, 0, 9);
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		for (int i : arr1) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------------");
		
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				
				if (arr[j-1] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}	
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
