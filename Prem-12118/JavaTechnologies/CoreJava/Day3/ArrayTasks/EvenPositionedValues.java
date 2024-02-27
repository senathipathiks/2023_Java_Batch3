package Day3.ArrayTasks;
import java.util.*;
public class EvenPositionedValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int count = 0;
		System.out.println("Enter the elements want to find even position element");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("The Even positioned  elements in the array");
		for (int i = 0; i < n; i++) {
			if (i % 2 != 0) {
				System.out.println(arr[i]);
				count++;
			}
		}

	}

}
