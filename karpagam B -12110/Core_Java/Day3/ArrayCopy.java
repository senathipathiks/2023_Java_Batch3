package Com.Day3;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5};
		
		int arr2[]=arr1.clone();
		
		
		
		for (int i : arr2) {
			System.out.println( i);
		}

	}

}
