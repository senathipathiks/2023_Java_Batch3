package Day3;

public class ex2Arraycopy {

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
        System.out.println();
        
        
       
        // another copy method
        int array1[]={8,7,6,5,4,3,2,1};
        int arr2[]=new int[8];
//        int arr2[]=array1.clone();
        
//        for (int i: arr2) {
//        	System.out.println(i);
//        }
//        
        
        // arraycopy method
        
        System.arraycopy(array1, 0, arr2, 0, 4);
        
        for (int i: arr2) {
        	System.out.println(i);
        }
        
        
        
        

}
}
