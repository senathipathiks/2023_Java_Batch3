package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predict {

	public static void main(String[] args) {
		List<Integer> no = Arrays.asList(11, 12, 33, 44);
		
		Predicate<Integer> n = (x)-> x.equals(11);
		
		for (Integer i : no) {
			if(n.test(i))
				System.out.println(i);
		}
		
	}

}
