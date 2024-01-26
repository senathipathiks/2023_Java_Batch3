package Java_Day_3;

public class ArrayCopy {

	public static void main(String s1[]) {
		int arr[]= {1,2,3,4,5};
		int arr1[]=arr.clone();
		

	
//	for (int i:arr1) {
//		System.out.println(i);
//	}
		
		System.arraycopy(arr,0,arr1,0,5);//(array name,starting index to copy,clone array name,starting copy index,length)
		for(int i:arr1) {
			System.out.println(i);
		}
	}
}
