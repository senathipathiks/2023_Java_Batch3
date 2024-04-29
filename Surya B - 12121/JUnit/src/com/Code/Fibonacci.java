package com.Code;

public class Fibonacci {
	int first = 0;
	int second = 1;
	
	public void printFibonacci(int limit) {
		
		looping(limit);
	}

	private void looping(int limit) {
		while(second < limit){ 
			
			
			System.out.print(second + " ");
			
			second = second + first;
			first = second - first;
		//<img src={`data:image/jpeg[png];base64.${image.imageData}`}	
			
		}
	}
	
	public static void main(String[] args) {
		
		Fibonacci fibonacci = new Fibonacci();
		
		fibonacci.printFibonacci(10);
	}
}
