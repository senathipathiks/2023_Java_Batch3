package Day3;

public class CopyArray {

	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30, 40, 50 };

//		int arr2[] = arr1.clone();//int arr2[]=arr1;

		int arr2[] = new int[5];
		System.arraycopy(arr1, 2, arr2, 0, 3);
		for (int i : arr2) {
			System.out.println(i);
		}

	}

}
