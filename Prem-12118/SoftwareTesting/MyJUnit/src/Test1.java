import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test1 {

	@Test
	void test_makeUpper_1() {
		
		TestMe tst1 = new TestMe();
		String result=tst1.makeUpper("google");
		assertEquals("GOOGLE",result);
		 
	}
	@Test
	void test_makeUpper_2() {
		
		TestMe tst1 = new TestMe();
		String result=tst1.makeUpper("Prem");
		assertEquals("PREM",result);
		 
	}
	@Test
	void test_findSum_1() {
		
		TestMe tst1 = new TestMe();
		int  result=tst1.findSum(10,20);
		assertEquals(30,result);
		 
	}

}
