package Day3.ClassExamples;
import java.util.*;

public class ArrayEx3 {

	public static void main(String[] args) {
		
        int arr1[]= {1,2,45,6};
        for(int i:arr1) {
        	System.out.println(i);
        }
        //int arr2[]=arr1;//array copy
        int arr2 []= new int[4];
        System.arraycopy(arr1, 0, arr2, 0, 4);//arraycopy method
        Arrays.sort(arr1);//sorting method
        System.out.println(Arrays.toString(arr1));//to print array in a string type
        for(int i:arr2) {
        	System.out.println(i);
        }
	}

}
