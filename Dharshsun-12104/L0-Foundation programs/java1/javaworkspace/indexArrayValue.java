package com.java1;

public class indexArrayValue {

	public static int findIndexApproach1(int[] array, int element) {
	      for (int i = 0; i < array.length; i++) {
	         if (array[i] == element) {
	            return i;
	         }
	      }
	      return -1; // Element not found
	   }

	   public static void main(String[] args) {
	      int[] array = {1, 2, 3, 4, 5};
	      int element = 3;
	      int index = findIndexApproach1(array, element);
	      System.out.println("Index of element " + element + ": " + index);

}
}