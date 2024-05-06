package com.rts.DevopsJenkinsDemo;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WorkLogTest {

	WorkLog work = new WorkLog();

	@Test
	public void testAddLog1() {
		assertEquals("Added Log For kavi", work.addToLog("kavi"));

	}

	@Test
	public void testAddLog2() {
		assertEquals("Added Log For sri", work.addToLog("sri"));

	}

	@Test
	public void testAddLogins1() {
		assertEquals("Added Login Log For yoga", work.addLogins("yoga"));

	}

	@Test
	public void testAddLogins2() {
		assertEquals("Added Login Log For selvi", work.addLogins("selvi"));

	}
}
