package com.mavenjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.mavenjunit.demo.Calculator;

class example {

	

	@Test
	void test() {
		Calculator calc = new Calculator();
		int sum = calc.evaluate("0+4+6");
		assertEquals(10, sum);
	}

}
