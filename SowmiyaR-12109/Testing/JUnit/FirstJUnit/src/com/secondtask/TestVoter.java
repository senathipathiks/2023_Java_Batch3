package com.secondtask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestVoter {

	@Test
	public  void test_checkage() {
        Voter v=new Voter();
        try {
            System.out.println("23: " + v.checkAge(23)); // Expected: Eligible
            System.out.println("16: " + v.checkAge(16)); // Expected: Not Eligible
            v.checkAge(7); // Expected: MinorAgeException
            v.checkAge(-18); // Expected: InvalidAgeException
        } catch (MinorAgeException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

}
