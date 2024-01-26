package Day_2;

public class ArrayCopy {

	public static void main(String a[]) {
		
		int arr[] = {10,20,30,40,50};
		
		int arr1[] = new int[5];
		
		System.arraycopy(arr, 0, arr1, 1, 4);
		for(int i:arr1) {
			System.out.println(i);
		}
		
	}
}
