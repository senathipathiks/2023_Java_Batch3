package com.Day5;



abstract class Account{
	
	float balance;
	int time;
	
	abstract void calculateInterest(float balance,int time);
	
}

class SavingsAccount extends Account{

	@Override
	void calculateInterest(float balance,int time) {
		
		System.out.println("Rate of Saving A/c Interest is 4%");
		
		float SInterest = balance *(1 + (3*time));
		
		System.out.println("The Savings Account Interest is :" +SInterest);
		
	}
}
	
	
	class Currentaccount extends Account{

		@Override
		void calculateInterest(float balance,int time) {
			
			System.out.println("Rate of Current A/c Interest is 5%");
			
			int i = (1+(15/1));
			float CI = (float) (balance *Math.pow(i,(1*time)));
			
			System.out.println("The Current Account Interest is :"+CI);
			
			
		}
		
		
	}
	
	class RD extends Account{
		


		@Override
		void calculateInterest(float balance, int time) {
			

			System.out.println("Rate of Current A/c Interest is 3%");
			
			// A = P x (1 + r/100)^nt 
			
			float i = (1+(3/1));
			
			//System.out.println(i);
			
			float rd = (float)(balance*Math.pow(i,1*time ));
			
			System.out.println("The Post office RD Scheme Interesr is :"+rd);
			
			
			
		}
		
		
		
	}

	
	
	


public class Accounts {

	public static void main(String[] args) {
		
		
		Account s = new SavingsAccount();
		
		
		Currentaccount c = new Currentaccount();
		
		Account rd = new RD();
		
		s.calculateInterest(200, 1);
		c.calculateInterest(300, 1);
		rd.calculateInterest(400, 1);
	}

}
