package Day3;

public class ArrayClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		
		//int arr1[]=arr.clone(); 
		int arr1[]=new int[5];
		System.arraycopy(arr, 2, arr1, 0, 3);
		for(int i:arr1) {
		System.out.println(i);
		}
	}

}
