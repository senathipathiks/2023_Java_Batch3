package com.increasingordecreasingnumber;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class TestProgram1 {

	@Test
	public void testProgram_1() {
		Program1 program = new Program1();
		boolean result = program.findIncreasing(1234);
		assertEquals(true, result);
	}

	@Test
	public void testProgram_2() {
		Program1 program = new Program1();
		boolean result = program.findIncreasing(1220);
		assertEquals(false, result);
	}

	@Test
	public void testProgram_3() {
		Program1 program = new Program1();
		boolean result = program.findIncreasing(1212);
		assertEquals(false, result);
	}

	@Test
	public void testProgram_4() {
		Program1 program = new Program1();
		boolean result = program.findIncreasing(123);
		assertEquals(true, result);
	}
	
	@Test
	public void testProgram_5() {
		Program1 program = new Program1();
		boolean result = program.findIncreasing(778);
		assertEquals(true, result);
	}
	
	@Test
	public void testProgram_6() {
		Program1 program = new Program1();
		boolean result = program.findIncreasing(776);
		assertEquals(false, result);
	}

}
