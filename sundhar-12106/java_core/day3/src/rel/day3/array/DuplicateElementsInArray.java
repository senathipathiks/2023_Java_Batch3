package rel.day3.array;

import java.util.Arrays;

public class DuplicateElementsInArray {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,1,8,9,2};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("the duplicate elements are");
		
		for (int i = 0; i < arr.length-1; i++) {
			
			if(arr[i] == arr[i+1])
				System.out.println(arr[i]);
		}
	}

}
