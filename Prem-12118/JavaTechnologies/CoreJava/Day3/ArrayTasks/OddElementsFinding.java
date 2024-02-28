package Day3.ArrayTasks;
import java.util.*;
public class OddElementsFinding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements want to find odd element");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int count=0;
		System.out.println("Enter the elements want to find odd element  entries");
		for (int i = 0; i <n; i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println("The odd elements in the array");
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
				count++;
			}
		}
		System.out.println("The total odd elements in the array:"+count);
	}

}
