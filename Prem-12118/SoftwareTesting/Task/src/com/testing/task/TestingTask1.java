package com.testing.task;

public class TestingTask1 {


	public int findIncreasing(int input) {
		
        int prevDigit = input % 10; //4
        input = input / 10; //123
        int value = 1;
        
        while (input > 0) { //123 > 0
            int currentDigit = input % 10; //3
            if (currentDigit > prevDigit) { //3 < 4
                value = 0; // Not an increasing number
            }
            prevDigit = currentDigit;
            input /= 10;
        }

      return value;
    }
}