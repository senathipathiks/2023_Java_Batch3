package Com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Com.demo.Demo;

public class TestDemo {

	@Test
	void test_1() {
		Demo test1 = new Demo();
		String resString = test1.makeUpper("durgesh");
		assertEquals("DURGESH", resString);
	}

	@Test
	void test_2() {
		Demo test1 = new Demo();
		String resString = test1.makeUpper("nandhini");
		assertEquals("NAndHINI", resString);
	}
	
	@Test
	void test_3() {
		Demo test1 = new Demo();
		int resString = test1.findSum(10, 10);
		assertEquals(30, resString);
	}

}
