package com.mavenworks.ArcheTypeDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LogicalTest {

	@Test
	public void test() {
		Logical log = new Logical();
		String res = log.trimText("Srinivasan");
		assertEquals("Sriniv", res);
	}

}
