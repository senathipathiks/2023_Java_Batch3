package Day_3;

import java.util.Arrays;

public class JaggedArray {

	public static void main(String[] args) throws InterruptedException {
		int arr[][]= {
				{1,2,3},{5,6,7,8},{11,43}
//			3 rows 1st row contains 3 columns 2nd row contains 4 columns 3rd row contains 2 columns
		};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]+" ");
				Thread.sleep(1000);
			}
		}
		
		System.out.println(Arrays.deepToString(arr));

	}

}
