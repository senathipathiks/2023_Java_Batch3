package com.day4adv;
class Stud
{
	int rollno;
	String name;
	
	Stud(){}
	
	Stud(int rollno, String name)
	{
		this.rollno = rollno;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", name=" + name + "]";
	}
}
class Mark extends Stud
{
	int mark1,mark2,mark3;
	Mark()
	{
		super();
	}
	Mark(int no, String n, int n1, int n2, int n3)
	{
		super(no,n);
		mark1=n1;
		mark2=n2;
		mark3=n3;
	}
	@Override
	public String toString() {
		return "Mark [mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3 + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Mark obj = new Mark(123,"abi",100,100,90);
	System.out.println(obj.toString());
	}

}
