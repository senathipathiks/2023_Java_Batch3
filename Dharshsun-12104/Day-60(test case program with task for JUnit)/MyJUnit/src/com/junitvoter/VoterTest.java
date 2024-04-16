package com.junitvoter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VoterTest {
    private Voter voter = new Voter();

    @Test
    public void testEligibility() throws Exception {
        assertEquals("Eligible", voter.checkEligibility(23));
        assertEquals("Not Eligible", voter.checkEligibility(16));
    }

    @Test(expected = MinorAgeException.class)
    public void testMinorAgeException() throws Exception {
        voter.checkEligibility(7);
    }

    @Test(expected = InvalidAgeException.class)
    public void testInvalidAgeException() throws Exception {
        voter.checkEligibility(-18);
    }
}

