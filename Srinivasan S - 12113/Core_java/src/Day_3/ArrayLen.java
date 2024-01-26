package Day_3;

public class ArrayLen {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		String arr1[]= {"10","20","30","40","50"};
		
		System.out.println(arr.length);
	
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for (String i : arr1) {
			System.out.println(i);
		}
	}

}
