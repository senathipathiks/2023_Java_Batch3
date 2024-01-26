package Day3.ArrayTasks;
import java.util.*;
public class DuplicateArrayElementsandCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements want to find dublicate enetries");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int count=0;

		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					System.out.println("The duplicate element in the array: " + arr[j]);
				}
			}			
		}
		System.out.println("The total Duplicate elements: "+count);

	}

}
