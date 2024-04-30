package com.task;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class FindTestIncrease {

	@Test
	   public  void test_findIncreasing() {
	        FindIncrease program = new FindIncrease();
	        int[] testValues = {1234, 1220, 1212, 123, 778, 776};
	        for (int value : testValues) {
	            int result = program.findIncreasing(value);
	            System.out.println("Input: " + value + ", Result: " + result);
	        }
	    }
}
