package rel.day3.array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class MultiDimensionalArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Jacked
		int [][] arr = {{1,2,3},{4,5},{6,7,8,9}};
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
		
		
	}

}
