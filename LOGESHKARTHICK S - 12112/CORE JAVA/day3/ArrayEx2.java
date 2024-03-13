package core.day3;

import java.util.Scanner;

public class ArrayEx2 {
    static double average(int a[],int n) {
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum+=a[i];
        }
        System.out.println("The total:"+sum);
        return (double)sum/n;
    }
public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n;
    System.out.println("Enter the total elements:");
    n=s.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the array elements");
    for(int i=0;i<n;i++) {
        arr[i]=s.nextInt();
    }
    System.out.println("the average of all elements:"+average(arr, n));
}

}


