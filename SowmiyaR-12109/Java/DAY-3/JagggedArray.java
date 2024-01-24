package Day3;

import java.util.Arrays;

public class JagggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][]= {{1,2,3},
		{4,5},
		{6,7,8,9}};
		
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
//				System.out.print(x[i][j]);
			}
//			System.out.println("\n");
			
		}
		System.out.println(Arrays.deepToString(x));

	}

}
