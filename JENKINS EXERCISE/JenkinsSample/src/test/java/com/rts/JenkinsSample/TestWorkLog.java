package com.rts.JenkinsSample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWorkLog 
{
	WorkLog w1=new WorkLog();
	
	@Test
	public void testAddToLog1()
	{
		assertEquals("Added Log For Remo", w1.addToLog("Remo"));
	}
	
	@Test
	public void testAddToLog2()
	{
		assertEquals("Added Log For Yokesh", w1.addToLog("Yokesh"));
	}
	
	@Test
	public void testAddToLogins1()
	{
		assertEquals("Added Login Log For Varshinee", w1.addLogins("Varshinee"));
	}
	
	@Test
	public void testAddToLogins2()
	{
		assertEquals("Added Login Log For Appu", w1.addLogins("Appu"));
	}
	

}
