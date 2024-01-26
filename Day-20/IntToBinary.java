package com.Day2;

public class IntToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Int = 2;
		
		int index =0;
		
	int binary[]= new int[40];
		
		while (Int>0) {
			
			binary[index++] = Int%2;
			Int=Int/2;
		}
		
		for(int i = index-1;i>=0;i--) {
			
			System.out.print(binary[i]);
		}
		
		System.out.println();

	}
	

}
