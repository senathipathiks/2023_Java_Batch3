package com.firstPack;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestTestMe {


//	@Test
//	public void findIncreasing()
//	{	
//		Test1 test=new Test1();		
//		int x=test.findIncreasing(1234);		
//		assertEquals(1, x);				
//	}
	
	
	@Test
	public void checkAge()
	{	
		String x="";
		Test1 test=new Test1();		
		try {
		 x=test.checkTheAge(-18);
		if(x.equals("Eligible")) {
			assertEquals(x,"Eligible");	
		}else {
			assertEquals(x,"Not Eligible");	
		}
		} catch (InvalidAgeException e) {
			
			fail(e.getMessage());
			
		}catch (MinorAgeException e) {
			
			fail(e.getMessage());
			
			
		}		
					
	}
	
}
