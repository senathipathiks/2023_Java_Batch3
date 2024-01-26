package Day_3;

public class OddPosition {

	public static void main(String[] args) {
		 int arr[]=new int[] {3,1,5,6,9,7};
		 System.out.println("Odd position elements are ");
		 for (int i = 0; i < arr.length; i=i+2) {
			System.out.println(arr[i]);
		}
	}

}
