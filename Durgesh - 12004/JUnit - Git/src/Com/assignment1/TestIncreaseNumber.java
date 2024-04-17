package Com.assignment1;

import static org.junit.jupiter.api.Assertions.*;
import Com.assignment1.IncreaseNumber;

import org.junit.jupiter.api.Test;

class TestIncreaseNumber {

	@Test
	void test_findIncreaseNumber() {
		IncreaseNumber i = new IncreaseNumber();
		int num = i.findNum(1234);
		assertEquals(1, num);
	}

}
