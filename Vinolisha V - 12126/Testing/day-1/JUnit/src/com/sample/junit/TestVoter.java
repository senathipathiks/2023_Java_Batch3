package com.sample.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestVoter {

	@Test
	void test_eligible_case(){
		
		Voter voter=new Voter();
		try {
			String msg=voter.checkAge(23);
			assertEquals("Eligible", msg);
		}catch(MinorAgeException | InvalidAgeException m){
			fail();
		}
		
	}
	
	@Test
	void test_Noteligible_case(){
		
		Voter voter=new Voter();
		try {
			String msg=voter.checkAge(15);
			assertEquals("Not Eligible", msg);
		}catch(MinorAgeException | InvalidAgeException m){
			fail();
		}
		
	}
	
	@Test
	void test_MinorAge(){
		
		Voter voter=new Voter();
		try {
			voter.checkAge(5);
		}catch(MinorAgeException | InvalidAgeException m){
			fail();
		}
		
	}
	
	@Test
	void test_NegativeAge(){
		
		Voter voter=new Voter();
		try {
			voter.checkAge(-17);
		}catch(MinorAgeException | InvalidAgeException m){
			fail();
		}
		
	}

}
