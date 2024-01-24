package rel.day3.array;

public class AccessingArray {
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,60,70};
		
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("----------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-------------");
		
		String names[] = {"sundhar","srinivasan","Hemz","prasanth"};
		
		for (String s : names) {
			System.out.println(s);
		}
	}

}
