package com.rts.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LogicalTest {

	@Test
	public void test1() {
		Logical log = new Logical();
		assertEquals("HIG", log.trimText("HIGH"));
	}

	@Test
	public void test2() {
		Logical log = new Logical();
		assertEquals("KAV", log.trimText("KAVIYA"));
	}

}
