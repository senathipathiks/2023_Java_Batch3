package com.junit.day61;

import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.List;

public class CheckIncreasingNumber {

	int checkNumber(int number) {

		List<Integer> list = new ArrayList<Integer>();

		while (number > 0) {
			list.add(number % 10);
			number /= 10;
		}
		
		for(int i=0;i<list.size()-1 ;i++) {
			if(list.get(i)<list.get(i+1))
				return 0;
		}
		
		return 1;
	}

}
