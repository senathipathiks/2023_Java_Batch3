package junit;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test1 {

//	@Test
//	void test_makeUpper_1() {
//		TestMe ts1 = new TestMe();
//		String result = ts1.makeUpper("google");
//		assertEquals("GOOGLE", result);
//	}
//
//	@Test
//	void test_makeUpper_2() {
//		TestMe ts1 = new TestMe();
//		String result = ts1.makeUpper("ram");
//		assertEquals("RAM", result);
//	}
//
//	@Test
//	void test_findSum_1() {
//		TestMe ts1 = new TestMe();
//		int result = ts1.findSum(10, 20);
//		assertEquals(30, result);
//	}

	@Test
	void test_divideNums() {
		int [] input = { 100, 20, 5, 0 };
		int res = 0;
		TestMe t = new TestMe();
		try {
			res = t.divideNums(input);
			assertEquals(-1, res);
		} catch (Exception e) {
			fail();
		}
	}

}
