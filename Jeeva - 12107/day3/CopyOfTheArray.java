package com.corejava.day3;
import java.util.Scanner;

public class CopyOfTheArray {
	public static void main(String[] args) {
		
		int[] copy= {010,020,060,8,3,060};
		
		int[] duplicateArray=copy.clone();
		
		for (int i : duplicateArray) {
			System.out.print(i+" ");
		}
	}

}
