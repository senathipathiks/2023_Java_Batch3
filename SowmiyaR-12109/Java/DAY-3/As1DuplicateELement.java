package Day3;

import java.util.Scanner;

public class As1DuplicateELement {

	public static void main(String[] args) {
//		int arr[]= {20,20,2,10,2};
		System.out.println("Enter the value:");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int arr[]=new int[k];
		System.out.println("Enter"+k+" Element");
		for(int i=0;i<k;i++) {
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			for(int n=j+1;n<arr.length;n++) {
				if(arr[j]==arr[n])
				System.out.println("Duplicated values are "+arr[n]);
			}
		}

	}

}
