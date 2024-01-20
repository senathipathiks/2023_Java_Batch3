package com.day1;

interface Account{
	void calcInterest();
}
class SavingAccount implements Account {
	int p=1000;
	int n=4;
	float r=0.2f;
	float SI = ((p*n*r)/(100));
      public void calcInterest() {
		System.out.println("Simple Interset of the Saving Account is "+ SI);
	}
	
}
class CurrentAccount extends SavingAccount{
	int p=1000;
	int n=4;
	float r=0.2f;
	float SI = ((p*n*r)/(100));
      public void calcInterest() {
    	  System.out.println("Simple Interset of the Current Account is "+ SI);
      }
}

public class Interface {

	public static void main(String[] args) {
		SavingAccount obj = new CurrentAccount();
		obj.calcInterest();

	}

}
