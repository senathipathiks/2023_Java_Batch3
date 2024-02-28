package Day3.ClassExamples;
import java.util.*;
public class ArrayEx2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter 10 array values to find sum and average:");
	        int n = 10;  
	        int arr[] = new int[n];
	        int sum = 0;

	        for (int i = 0; i < n; i++) {
	            int val = sc.nextInt();
	            arr[i] = val;
	            sum += val;
	        }

	        
	        double avg = sum / n;
	 
	        System.out.print("Array values: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }

	        System.out.println("\nSum: " + sum);
	        System.out.println("Average: " + avg);

	}

}
