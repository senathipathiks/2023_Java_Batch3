package com.test.test_app;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.rel.test.Logical;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	
    @Test
    public void test1()
    {
    	Logical l = new Logical();
        assertEquals("TRO", l.trimText("TROY"));
    }
    
    @Test
    public void test2()
    {
    	Logical l = new Logical();
        assertEquals("HIG", l.trimText("HIGH"));
    }
}
