package rel.day3.array;

import java.util.Arrays;

//1.repeated character 2.encryption the string

public class CountDuplicateArray {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,1,5,2,6,1,8,9,2,1},count = 1;
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] == arr[i+1])
			{
				count++;
			}
			if(arr[i] != arr[i+1] && count > 1) {
				System.out.println("the value "+arr[i] +" repeated "+count);
				count = 1;
			}
		}
	}

}
