package com.day5;
abstract class Employee1{
	int eno;
	String name;
	int payperday;
	void read_emp(int eno,String name,int pay)
	{
		this.eno=eno;
		this.name=name;
		payperday=pay;
	}
	void display()
	{
		System.out.println("Employee No:"+ eno+" "+"Employee Name: "+name);
	}
	abstract void calculateSalary();
}
class Contract extends Employee1{
	int days;
	void read_contract(int eno,String name,int pay,int days)
	{
		super.read_emp(eno, name, pay);
		this.days=days;
	}
	void calculateSalary()
	{
		System.out.println("Salary is :"+(days*payperday));
	}
}
class Fulltime extends Employee1
{
	int days;
	void read_Fulltime(int eno,String name,int pay,int days)
	{
		super.read_emp(eno, name, pay);
		this.days=days;
	}
	void calculateSalary()
	{
		System.out.println("Salary is :"+(days*payperday));
	}
}
public class EmpEgAbstraction {

	public static void main(String[] args) {
		
	Fulltime obj1 = new Fulltime();
	obj1.read_Fulltime(123, "Sherin", 1000, 20);
	obj1.display();
	obj1.calculateSalary();
	
	Contract obj2=new Contract();
	obj2.read_contract(32, "Kiruba", 2300,87);
	obj2.calculateSalary();

	}

}
