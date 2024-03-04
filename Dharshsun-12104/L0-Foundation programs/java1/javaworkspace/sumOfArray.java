package com.java1;
import java.util.Arrays;
public class sumOfArray {
	public static void main(String[] args) {
		 int [] nums = {1,2,3,4,5};
         int sum = Arrays.stream(nums).sum();
         System.out.println(sum);// prints sum = 1+2+3+4+5 = 15
	    }
	
	}

