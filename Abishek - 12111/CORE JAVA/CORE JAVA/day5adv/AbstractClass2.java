package com.day5adv;
abstract class Employees1
{
	int eno;
	String ename;
	int payperday;
	void read_Emp(int eno, String ename, int payperday)
	{
		this.eno=eno;
		this.ename=ename;
		this.payperday=payperday;
		
	}
	void display()
	{
		System.out.println("Employees No: " +eno+ "Employee name: " +ename);
	}
	abstract void calculateSalary();
	
	
}
class Contract extends Employees1
{
	int days;
	void read_Contract(int eno, String ename, int payperday, int days)
	{
		super.read_Emp(eno, ename, payperday);
		this.days=days;
	}
	void calculateSalary()
	{
		System.out.println("Salary is : " +(days*payperday));
	}
}
class FullTime extends Employees1
{
	int days;
	void read_fullTime(int eno, String ename, int payperday, int days)
	{
		super.read_Emp(eno, ename, payperday);
		this.days=days;
	}
	void calculateSalary()
	{
		System.out.println("Salary is : " +(days*payperday));
	}
}

public class AbstractClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTime obj = new FullTime();
		obj.read_fullTime(123,"abishek",50000, 30);
		obj.calculateSalary();
		obj.display();

		Contract obj1 = new Contract();
		obj1.read_Contract(125, "lee", 50000, 10);
		obj1.calculateSalary();
		obj1.display();
		
		
	}

}
