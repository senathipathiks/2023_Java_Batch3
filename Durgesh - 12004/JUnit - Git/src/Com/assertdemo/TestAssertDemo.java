package Com.assertdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAssertDemo {

	@Test
	void test() {
		int []input = {100,20,5,0};
		int result = 0;
		AssertDemo test1 = new AssertDemo();
		try {
			result = test1.divideNums(input);
			assertEquals(-1, result);
		}
		catch (Exception e) {
			fail();
		}
	}

}
