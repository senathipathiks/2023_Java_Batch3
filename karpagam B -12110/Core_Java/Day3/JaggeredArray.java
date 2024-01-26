package Com.Day3;

import java.util.Arrays;

public class JaggeredArray {

	public static void main(String[] args) {
        int x[][]= {{1,5,6},{4,5},{6,7,8,9}};
        
        for (int i = 0; i < x.length; i++) {
        	for (int j = 0; j < x[i].length; j++) {
//        		System.out.println(x[i][j]);
			}

			
		}
		System.out.println(Arrays.deepToString(x));// to print multidimensional array 

	}

}
