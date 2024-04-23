package com.junit.task1;

public class IncreasingNumber {

	boolean isIncreasing = true;

	public int findIncreasing(int input) { 
		int current = input % 10; 
		input = input / 10; 

		while (input > 0) { 
			if (current < input % 10) {
				isIncreasing = false;
				break;
			}

			current = input % 10; 
			input = input / 10; 
		}

		if (!isIncreasing) {
			return 0;
		} else {
			return 1;
		}

	}

}