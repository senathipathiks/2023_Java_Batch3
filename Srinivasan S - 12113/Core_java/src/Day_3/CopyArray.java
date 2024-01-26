package Day_3;



public class CopyArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
//		int arr1[]= arr.clone();// arr1[]=arr[]
		
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(i);
//		}
		int arr1[]= new int[5];
		System.arraycopy(arr,2,arr1,1,3);// array.copy is method of system where "arr"is previous array , "2" 
//		is from which index it should copy values , "arr1" is another array where we have to copy the array, "1" 
//		is from which index we have start to paste the array, "3" last indx to paste the array
		
		for (int i : arr1) {
			System.out.println(i);
		}
	}

}
