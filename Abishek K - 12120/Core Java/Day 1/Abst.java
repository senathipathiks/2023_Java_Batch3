package com.day1;

abstract class Account1{
     abstract void calcInterest();
}

class SavingAccount1 extends Account1 {
	int p=1000;
	int n=4;
	float r=0.2f;
	float SI = ((p*n*r)/(100));
	void calcInterest() {
		System.out.println("Simple Interest of SavingAccount: "+SI);
	}
}
class CurrentAccount1 extends SavingAccount1{
	int p=1000;
	int n=4;
	float r=0.2f;
	float SI = ((p*n*r)/(100));
	void calcInterest() {
		System.out.println("Simple Interest of CurrentAccount: "+SI);
	}
}

public class Abst {

	public static void main(String[] args) {
		SavingAccount1 obj = new CurrentAccount1();
		obj.calcInterest();

	}

}
