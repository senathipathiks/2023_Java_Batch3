package Com.Day3;

public class ArrayEg {

	public static void main(String args[] ) {
        int arr[]= {10,20,30,40,50};
        String[] name= {"Kaviya","kp","Raj"};
        
        //return the length of the element
        System.out.println(arr.length);
        //traverse
        for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
        System.out.println("----For each loop----");
//        for (int i : arr) {
//			System.out.println(i);
//		}
        for (String s : name) {
			System.out.println(s);
		}
        
        
        
        
        
	}

}
