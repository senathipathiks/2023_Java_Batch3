package com.junit.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestIncreasing {

	public int findIncreasing(int input) {
        String numStr = Integer.toString(input);
        for (int i = 0; i < numStr.length() - 1; i++) {
            char currDigit = numStr.charAt(i);
            char nextDigit = numStr.charAt(i + 1);
            if (currDigit >= nextDigit) {
                return 0; // Not an increasing
            }
        }
        return 1; // An increasing
    }
}
