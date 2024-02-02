package Day3;

import java.util.Arrays;

public class Arraysort {

	public static void main(String[] args) {
		
		int array[] = {8,7,6,5,4,3,2,1};
		
		Arrays.sort(array);
		// convert to string  
		System.out.println(Arrays.toString(array)); //  [1, 2, 3, 4, 5, 6, 7, 8]
		// normal print method
		for(int i: array) {
			System.out.print(i);              //12345678
		}

	}

}
