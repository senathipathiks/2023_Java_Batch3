package Day_2;

public class JaggedArray {

	public static void main(String[] args) {
		
		int x[][]= {
				{1,2,3},
				{3,4,5,6},
				{9,7}
		};
		
		for (int i = 0; i < x.length; i++) {
			{
				for(int j = 0; j<x[i].length;j++) {
					System.out.print(x[i][j]+" ");
					
				}
				
				System.out.println();
				System.out.println();
			}
			
		}

	}

}
