package com.junit.task;

import org.junit.jupiter.api.Test;

public class FindIncreasing {
	@Test
	   public  void test_findIncreasing() {
	        TestIncreasing program = new TestIncreasing();
	        int[] testValues = {1234, 1220, 1212, 123, 778, 776};
	        for (int value : testValues) {
	            int result = program.findIncreasing(value);
	            System.out.println("Input: " + value + ", Result: " + result);
	        }
	    }

}
