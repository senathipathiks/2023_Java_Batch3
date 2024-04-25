package com.myJunit.algorithm;

public class NumberIncreasingAlgorithm {

	public int checkIncreasing(int input) {

		int digit = 0;
		int temp = input;

		while (temp > 0) {
			temp = temp / 10;
			digit++;
		}

		while (digit > 0) {

			temp = input % 10;

			input = input / 10;

			if (input % 10 == 0 || temp == input % 10 || temp - 1 == input % 10) {
				digit--;
			} else {
				return 0;
			}

		}

		return 1;
	}

}
