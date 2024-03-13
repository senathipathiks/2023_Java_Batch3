package core.day3;

public class ArrayCopy {

    public static void main(String[] args) {
        int array[] = {8,7,6,5,4,3,2,1};
        int arr[]=new int[8];
        System.out.println("Original Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            arr[i]=array[i];
        }    
        
        System.out.println();
        System.out.println("Copy Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        
    }

}
