package com.day27;

public class ExceptionExample1 {

	public static void main(String[] args) {
		
		String str = "array";
		int[] arr = { 1 ,2 , 3 , 4, 0};
		int b = 10;
		try {
			int c = b/arr[1];
			System.out.println("Output : "+c);
			System.out.println("Output : "+str.charAt(5));
		}catch(ArithmeticException e) {
			System.err.println("Error : "+e.getMessage());
		}catch(StringIndexOutOfBoundsException e) {
			System.err.println("Error : "+e.getMessage());
		}catch(Exception e) {
			System.err.println("Excption : "+e);
		}
	}

}
