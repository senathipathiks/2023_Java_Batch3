package com.myJunit.second;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.myJunit.third.Test3;
import com.myJunit.third.Test3;

public class Test2 {

	@Test
	void test_divideNums() {
		
		int []input = {100,20,0};
		
		int res = 0;
		
		Test3 t = new Test3();
		
		try {
			res = t.test_divideNums(input);
			assertEquals(-1, res);
		} catch (Exception e) {
			fail("arithmetic exception");
		}
		
	}

}
