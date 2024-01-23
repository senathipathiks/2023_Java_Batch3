package Day_3;

public class EvenPosition {

	public static void main(String[] args) {
		int arr[]= {2,4,5,1,9,6};
		System.out.println("Even position elements are ");
		for (int i = 1; i < arr.length; i=i+2) {
			System.out.println(arr[i]);
		}
	}

}
