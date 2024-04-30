package com.testing.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Task2TestCase {

    @Test
    public void testAgeEligible_ValidAge() {
        TestingTask2 task = new TestingTask2();
        String result = null;
        try {
            result = task.checkAge(23);
        } catch (InvalidAgeException | MinorAgeException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
        assertEquals("Eligible to Vote", result);
    }

    @Test
    public void testAgeEligible_NegativeAge() {
        TestingTask2 task = new TestingTask2();
        assertThrows(InvalidAgeException.class, () -> {
            task.checkAge(-18);
        });
    }

    @Test
    public void testAgeEligible_MinorAge() {
        TestingTask2 task = new TestingTask2();
        assertThrows(MinorAgeException.class, () -> {
            task.checkAge(7);
        });
    }

    @Test
    public void testAgeEligible_BorderlineAge() {
        TestingTask2 task = new TestingTask2();
        String result = null;
        try {
            result = task.checkAge(16);
        } catch (InvalidAgeException | MinorAgeException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
        assertEquals("Not Eligible to Vote", result);
    }
}
