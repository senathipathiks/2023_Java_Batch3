package com.mavenjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mavenjunit.demo.Calculator;

class CalculatorMyTest {

	@Test
	void evalauateExpression() {
		Calculator calc = new Calculator();
		int sum = calc.evaluate("0+4+6");
		assertEquals(1, sum);

	}

}
